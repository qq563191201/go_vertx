package com.gtshgame.vertx.handler; 
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gtshgame.App;
 import io.vertx.core.AbstractVerticle;
import io.vertx.core.Handler;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.Session;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.CookieHandler;
import io.vertx.ext.web.handler.SessionHandler;
import io.vertx.ext.web.sstore.ClusteredSessionStore;
import io.vertx.ext.web.sstore.LocalSessionStore;
import io.vertx.ext.web.sstore.SessionStore;
import com.alibaba.fastjson.JSON;
import com.gtshgame.App;
import com.gtshgame.common.interfaces.MsgInterfaceVertx;
import com.gtshgame.common.util.GoUtils;
import com.gtshgame.vertx.beans.Bean_Vertx_FirstCharge_FirstCharge;
import com.gtshgame.common.msg.protobuf.FirstCharge;
import com.gtshgame.common.msg.protobuf.FirstChargeReslut;

public class vertx_FirstCharge_FirstCharge_Json_Handler implements Handler<RoutingContext>,ApplicationContextAware{ 
ApplicationContext appctx;
Logger loger=Logger.getLogger(App.class);
@Override
public void handle(RoutingContext ctx) {
try {
loger.info(ctx.getBodyAsString());
String json=GoUtils.ToJsonStr(ctx.getBodyAsString());
FirstCharge message=JSON.parseObject(json,FirstCharge.class);
MsgInterfaceVertx<FirstCharge,FirstChargeReslut> bean=(MsgInterfaceVertx<FirstCharge,FirstChargeReslut>)appctx.getBean(Bean_Vertx_FirstCharge_FirstCharge.class);
String endstr;
endstr = JSON.toJSONString(bean.ProcessMsgInfo(message,ctx));
ctx.response().end(endstr);
} catch (Exception e) {
loger.error("e", e);
ctx.response().end("{\"issucc\":false}");}
}
@Override
public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
appctx=applicationContext;
 }
 }
