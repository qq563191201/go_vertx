package com.gojava.vertx.beans;
import org.springframework.beans.BeansException;
import com.gojava.util.*;
import com.gojava.vertx.bean.interfaces.LogicsInterfaces;
import io.vertx.ext.web.RoutingContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import com.gojava.errors.VerifyFieldValueNotPassException;import com.gojava.interfaces.MsgInterfaceVertx;
import com.gojava.msg.protobuf.VipChargeInfo;
import com.gojava.msg.protobuf.VipChargeInfoReslut;
public final class Bean_Vertx_VipChargeInfo_VipChargeInfo implements ApplicationContextAware,MsgInterfaceVertx<VipChargeInfo,VipChargeInfoReslut> {
ApplicationContext appctx;
@Override
public VipChargeInfoReslut ProcessMsgInfo(VipChargeInfo o,RoutingContext ctx) throws Exception {
if(!verfiyval(o)){ throw new VerifyFieldValueNotPassException("Filed Vaule Verfiy Error");}
//start
//end
LogicsInterfaces<VipChargeInfo,VipChargeInfoReslut> dobean=(LogicsInterfaces<VipChargeInfo,VipChargeInfoReslut>)appctx.getBean("VipChargeInfo_bean_VipChargeInfo");
return dobean.DoBean(o,ctx);
}
public  boolean verfiyval(VipChargeInfo o) {
boolean val=true;
return val;
}
@Override
public void setApplicationContext(ApplicationContext arg0) throws BeansException {
appctx=arg0;
}
}
