package com.gtshgame.vertx.beans;
import org.springframework.beans.BeansException;
import com.gtshgame.common.util.*;
import com.gtshgame.vertx.bean.interfaces.LogicsInterfaces;
import io.vertx.ext.web.RoutingContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import com.gtshgame.common.errors.VerifyFieldValueNotPassException;import com.gtshgame.common.interfaces.MsgInterfaceVertx;
import com.gtshgame.common.msg.protobuf.FirstCharge;
import com.gtshgame.common.msg.protobuf.FirstChargeReslut;
public final class Bean_Vertx_FirstCharge_FirstCharge implements ApplicationContextAware,MsgInterfaceVertx<FirstCharge,FirstChargeReslut> {
ApplicationContext appctx;
@Override
public FirstChargeReslut ProcessMsgInfo(FirstCharge o,RoutingContext ctx) throws Exception {
if(!verfiyval(o)){ throw new VerifyFieldValueNotPassException("Filed Vaule Verfiy Error");}
//start
//end
LogicsInterfaces<FirstCharge,FirstChargeReslut> dobean=(LogicsInterfaces<FirstCharge,FirstChargeReslut>)appctx.getBean("FirstCharge_bean_FirstCharge");
return dobean.DoBean(o,ctx);
}
public  boolean verfiyval(FirstCharge o) {
boolean val=true;
return val;
}
@Override
public void setApplicationContext(ApplicationContext arg0) throws BeansException {
appctx=arg0;
}
}
