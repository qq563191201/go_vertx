package com.gojava.vertx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gojava.com.gojava.App;

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
import io.vertx.ext.web.handler.StaticHandler;
import io.vertx.ext.web.sstore.ClusteredSessionStore;
import io.vertx.ext.web.sstore.LocalSessionStore;
import io.vertx.ext.web.sstore.SessionStore;

//@Scope("singleton")  
//@Component
public class GoHttpServer extends AbstractVerticle implements ApplicationContextAware {
	ApplicationContext ctx;
	UserMsgNats nats;
	Logger loger=LoggerFactory.getLogger(App.class);
	public void getCustomerById(RoutingContext ctx){
		Session session = ctx.session();
		if(session.get("id")==null)
			session.put("id", "sessionid");
		else{
			  loger.info("*****session ***************"+session.get("id"));
		}		
	   String str= 	ctx.request().getParam("id");
	   loger.info("*********************"+str+"sessionid:"+	session.id());
	  // ctx.setSession(session);
	   ctx.response().end("yes"+str);
	}
	public void addCustomer(RoutingContext ctx){
		
	}
	public void getAllCustomers(RoutingContext ctx){
		
		
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("destroy called");
	}

	 @PostConstruct
	public void start(){
		HttpServerOptions options = new HttpServerOptions().setMaxWebsocketFrameSize(1000000);

		HttpServer server =  App.getVertx().createHttpServer(options);
		/*server.requestHandler(request ->{
			 request.response().end("Hello world");			
	});*/
		CustPostGet Uget=new CustPostGet();
	Router router = Router.router( App.getVertx());
	Uget.Get(router);
	Uget.Post(router);
	SessionStore store = LocalSessionStore.create(App.getVertx());
	
	//SessionStore store = ClusteredSessionStore.create( App.getVertx());
	SessionHandler sessionHandler = SessionHandler.create(store);
	router.route().handler(sessionHandler);
	router.route().handler(CookieHandler.create());
	router.route().handler(BodyHandler.create());
	//---进行自动注册
	 //.getResource("interface.json");  
	//org.springframework.core.io.Resource fileRource = new ClassPathResource("interface.json");
	//ResourceUtils.getFile("classpath:interface.json");
	nats=new UserMsgNats();
	nats.start();

	try {
		ClassPathResource resource = new ClassPathResource("interface.json");
		InputStream is = resource.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));  
		String s=null;
		StringBuilder gostr=new StringBuilder();
		while((s=br.readLine())!=null) {
			gostr.append(s);
		}
	//	File cfgFile = fileURL.getFile();
	//	java.io.FileReader reander=new java.io.FileReader(is);
	//char[] mtext=new char[(int) br.readLine())];
	//	reander.read(mtext, 0, mtext.length);
		//  br.read(mtext, 0,  mtext.length);
	  JSONArray arrs=JSON.parseArray(gostr.toString());
	  int size=arrs.size();
	  JSONObject o=null;
	  for(int i =0;i<size;i++){
		  o=arrs.getJSONObject(i);
		  loger.info("/api"+o.getString("Path"));
		  loger.info("/api/json"+o.getString("Path"));
		  Handler<RoutingContext> msgpack=(Handler<RoutingContext>) App.context.getBean(o.getString("MsgPack"));
		  Handler<RoutingContext> msgJSON= (Handler<RoutingContext>) App.context.getBean(o.getString("Json"));
		  router.post("/api"+o.getString("Path")).blockingHandler(msgpack).produces("application/x-www-form-urlencoded");
		  router.post("/api/json"+o.getString("Path")).blockingHandler(msgJSON);
	  }
	} catch (IOException e) {
		// TODO Auto-generated catch block+
		e.printStackTrace();
	}
	//---二维码扫描街机登录
	//router.post("/sysapi/qrcode").blockingHandler(new QRCodeHandler());
	router.route("/static/*").handler(StaticHandler.create());
	router.route("/webroot/*").handler(StaticHandler.create());
//	router.route("/sysapi/qrcode/:w/:h/:zid/:did/:seat/qrcode.png").handler(new QRCodeHandler());
//	router.route("/sysapi/bjscqrcode/:w/:h/:zid/:did/:seat/bjscqrcode.png").handler(new BjscQRCodeHandler());
	//router.get("/sysapi/qrcode/:w/:h/:did/:seat/qrcode.png").handler(new QRCodeHandler());
	//读取路径配置以及注解
	//router.post("/api/msg/v1")
       //  .blockingHandler(new goen());
	     /*
	        router.get("/v1/customer/:id")
            .produces("application/json")
            .blockingHandler(this::getCustomerById);
    router.put("/v1/customer")
            .consumes("application/json")
            .produces("application/json")
            .blockingHandler(this::addCustomer);
    router.get("/v1/customer")
            .produces("application/json")
            .blockingHandler(this::getAllCustomers);*/
	    server.requestHandler(router::accept);

	    int port=8888;
	    if(App.getProperty("vertx.port")!=null)
	    port=Integer.parseInt(App.getProperty("vertx.port"));
		loger.debug("****************** http server **************************"+port);
		server.listen(port,  res -> {
			  if (res.succeeded()) {
				    System.out.println("Server is now listening!");
				  } else {
				    System.out.println("Failed to bind!");
				  }
				});
	
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		ctx=applicationContext;
	}
}
