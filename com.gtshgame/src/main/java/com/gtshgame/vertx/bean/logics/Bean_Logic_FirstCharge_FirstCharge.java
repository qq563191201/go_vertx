package com.gtshgame.vertx.bean.logics;

import org.springframework.beans.factory.annotation.Autowired;

import com.gtshgame.App;
import com.gtshgame.common.msg.protobuf.FirstCharge;
import com.gtshgame.common.msg.protobuf.FirstChargeReslut;
import com.gtshgame.service.TestService;
import com.gtshgame.vertx.bean.interfaces.LogicsInterfaces;
import io.vertx.ext.web.RoutingContext;
public class Bean_Logic_FirstCharge_FirstCharge extends BaseLogics implements LogicsInterfaces<FirstCharge,FirstChargeReslut>{
	
	@Autowired
	private TestService testService;
	@Override
	public FirstChargeReslut DoBean(FirstCharge v, RoutingContext ctx) {
		testService.update();
		return null;
	}
}
