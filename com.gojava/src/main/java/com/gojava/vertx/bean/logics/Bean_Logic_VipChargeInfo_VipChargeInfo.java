package com.gojava.vertx.bean.logics;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.gojava.db.dao.VipConfigMapper;
import com.gojava.db.dao.VipMoneyMapper;
import com.gojava.db.model.VipConfig;
import com.gojava.db.model.VipConfigExample;
import com.gojava.db.model.VipMoney;
import com.gojava.db.model.VipMoneyExample;
import com.gojava.msg.protobuf.VipChargeInfo;
import com.gojava.msg.protobuf.VipChargeInfoReslut;
import com.gojava.msg.protobuf.VipInfo;
import com.gojava.msg.protobuf.VipMoneyInfo;
import com.gojava.utils.GameRedisSyrnc;
import com.gojava.utils.RedisKeyUtil;
import com.gojava.vertx.bean.interfaces.LogicsInterfaces;
import io.vertx.ext.web.RoutingContext;

/**
 * title: vip 充值信息
 * des: 
 * @author Horst
 * @date 2017年12月28日 下午7:07:43
 * @version V1.0
 */
public class Bean_Logic_VipChargeInfo_VipChargeInfo extends BaseLogics implements LogicsInterfaces<VipChargeInfo,VipChargeInfoReslut>{
	
	private static Logger loger = Logger.getLogger(Bean_Logic_VipChargeInfo_VipChargeInfo.class);
	
	@Autowired
	private VipConfigMapper vipConfigMapper;
	
	@Autowired
	private VipMoneyMapper vipMoneyMapper;
	
	@Override
	public VipChargeInfoReslut DoBean(VipChargeInfo v, RoutingContext ctx) {
		VipChargeInfoReslut reslut = new VipChargeInfoReslut();
		String vipInfoRedis = GameRedisSyrnc.get_instance_center().getString(RedisKeyUtil.VIP_CONFIG_MONEY);
		List<VipInfo> vipInfoList = new ArrayList<>();
		if(vipInfoRedis == null || vipInfoRedis.equals("")) {
			addVipRedis(vipInfoList);
		}else {
			vipInfoRedis = GameRedisSyrnc.get_instance_center().getString(RedisKeyUtil.VIP_CONFIG_MONEY);
			vipInfoList = JSON.parseArray(vipInfoRedis, VipInfo.class);
		}
		reslut.setIssucc(true);
		reslut.setVipInfo(vipInfoList);
		loger.info(JSON.toJSONString(vipInfoList));
		return reslut;
	}
	
	/**
	 * @Title: vip充值信息为空加载redis
	 * @Description:
	 * @param vipInfoList
	 * @author Horst
	 * @date 2017年12月28日 下午8:25:16
	 * @version V1.0
	 */
	private void addVipRedis(List<VipInfo> vipInfoList) {
		List<VipConfig> vipList = vipConfigMapper.selectByExample(new VipConfigExample());
		VipMoneyExample vipMoneyExample = new VipMoneyExample();
		vipMoneyExample.setOrderByClause("day");
		List<VipMoney> moneyList = vipMoneyMapper.selectByExample(vipMoneyExample);
		for(VipConfig vc:vipList) {
			Integer vip = vc.getId();
			VipInfo vipInfo = new VipInfo();
			vipInfo.setVip(vip.toString());
			vipInfo.setName(vc.getName());
			List<VipMoneyInfo> vipMoneyInfoList = new ArrayList<>();
			for(VipMoney mon:moneyList) {
				if(mon.getLevel() == vip) {
					VipMoneyInfo moneyInfo = new VipMoneyInfo();
					moneyInfo.setDay(mon.getDay().toString());
					moneyInfo.setMoney(mon.getMoney().toString());
					moneyInfo.setId(mon.getId());
					vipMoneyInfoList.add(moneyInfo);
				}
			}
			vipInfo.setVipMoneyInfo(vipMoneyInfoList);
			vipInfoList.add(vipInfo);
		}
		GameRedisSyrnc.get_instance_center().setString(RedisKeyUtil.VIP_CONFIG_MONEY, JSON.toJSONString(vipInfoList));
	}
}
