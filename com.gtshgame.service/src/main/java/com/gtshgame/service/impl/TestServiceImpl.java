package com.gtshgame.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gtshgame.common.bean.OrderFirstChargeLog;
import com.gtshgame.common.bean.VipMoney;
import com.gtshgame.db.dao.OrderFirstChargeLogDao;
import com.gtshgame.db.dao.VipMoneyDao;
import com.gtshgame.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired 
	private VipMoneyDao vipMoneyMapper;
	
	@Autowired 
	private OrderFirstChargeLogDao orderFirstChargeLogMapper;
	
	@Override
	@Transactional
	public void update() {		
		VipMoney vip = new VipMoney();
		vip.setDay(13);
		vip.setLevel(15);
		vip.setMoney(55D);
		OrderFirstChargeLog order = new OrderFirstChargeLog();
		order.setUserId(3);
		order.setOrderNo("dfdsfs");
		vipMoneyMapper.insert(vip);
		orderFirstChargeLogMapper.insert(order);
	}
	
}
