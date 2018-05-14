package com.gojava.vertx.bean.logics;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.gojava.db.dao.ActivityMapper;
import com.gojava.db.dao.OrderFirstChargeLogMapper;
import com.gojava.db.model.Activity;
import com.gojava.db.model.OrderFirstChargeLog;
import com.gojava.msg.protobuf.FirstCharge;
import com.gojava.msg.protobuf.FirstChargeReslut;
import com.gojava.utils.GameRedisSyrnc;
import com.gojava.utils.MsgCodeUtil;
import com.gojava.utils.RedisKeyUtil;
import com.gojava.vertx.bean.interfaces.LogicsInterfaces;
import io.vertx.ext.web.RoutingContext;

/**
 * @Title: 首充双倍接口
 * @Description: 
 * @param v
 * @param ctx
 * @return
 * @author Horst
 * @date 2017年12月27日 下午7:13:23
 * @version V1.0
 */
public class Bean_Logic_FirstCharge_FirstCharge extends BaseLogics implements LogicsInterfaces<FirstCharge,FirstChargeReslut>{
	
	@Autowired
	private OrderFirstChargeLogMapper orderFirstChargeLogMapper;
	@Autowired
	private ActivityMapper activityMapper;

	@Override
	public FirstChargeReslut DoBean(FirstCharge v, RoutingContext ctx) {
		int userId = v.getUserId();
		FirstChargeReslut reslut = new FirstChargeReslut();
		if(userId == 0) {
			reslut.setMsg(MsgCodeUtil.PARAM_ERROR);
			return reslut;
		}
		//判断用户是否首充
		String firstChargeUserKey = RedisKeyUtil.ACT_FIRST_CHARGE_USER;
		boolean firstChargeUserExistKey = GameRedisSyrnc.get_instance_center().existsKey(firstChargeUserKey);
		if(!firstChargeUserExistKey) {
			//查询数据库
			OrderFirstChargeLog firstChargeLog = orderFirstChargeLogMapper.selectByPrimaryKey(userId);
			if(firstChargeLog != null) {
				return reslut;
			}
		}
		boolean isFirst = GameRedisSyrnc.get_instance_center().isHashSet(firstChargeUserKey, userId+"");
		if(isFirst) {
			return reslut;
		}
		String firstChargeConfigKey = RedisKeyUtil.ACT_FIRST_CHARGE;
		boolean firstChargeConfigExistKey = GameRedisSyrnc.get_instance_center().existsKey(firstChargeConfigKey);
		Map<String, String> map = new HashMap<String, String>();
		//判断是否有首充配置
		if(!firstChargeConfigExistKey) {
			Activity activity = activityMapper.selectByPrimaryKey(7);
			if(activity == null) {
				return reslut;
			}
			map.put("start", activity.getStartDatetime().getTime()+"");
			map.put("end", activity.getEndDatetime().getTime()+"");
			map.put("state", activity.getState().toString());
			GameRedisSyrnc.get_instance_center().hmset(firstChargeConfigKey, map);
		}else {
			map = GameRedisSyrnc.get_instance_center().getHashMapAll(firstChargeConfigKey);
		}
		//0关1开
		int state = Integer.valueOf(map.getOrDefault("state", "0"));
		if(state == 0) {
			reslut.setMsg(MsgCodeUtil.ACTIVITY_NOTOPEN_ERROR);
			return reslut;
		}
		long start = Long.valueOf(map.getOrDefault("start", "0"));
		long end = Long.valueOf(map.getOrDefault("end", "0"));
		long time = System.currentTimeMillis();
		//判断是否在开启时间内
		if(time < start || time > end) {
			reslut.setMsg(MsgCodeUtil.ACTIVITY_NOTOPEN_ERROR);
			return reslut;
		}
		reslut.setState(1);
		reslut.setIssucc(true);
		return reslut;
	}
	
}
