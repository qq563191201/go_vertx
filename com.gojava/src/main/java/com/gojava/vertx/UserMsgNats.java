package com.gojava.vertx;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.gojava.com.gojava.App;
import com.gojava.utils.GameRedisSyrnc;

import io.vertx.core.AbstractVerticle;

public class UserMsgNats   extends Thread  {
	io.nats.client.Connection natcon;
	 @Override
	 public void run() {
		 minstart();
	 }
	  protected void finalize(){
		  GameRedisSyrnc.get_instance_center().GetJedis().close();
	  }
	 @PostConstruct
		public void minstart(){
		 String NatURL=App.getProperty("nats.host");
		 String host=App.getProperty("redis.host");
		 int Port = Integer.parseInt(App.getProperty("redis.port"));
		 String pwd = App.getProperty("redis.pwd");
		 GameRedisSyrnc.get_instance_center().addGameRedis("center",host,Port,pwd);
		 
//		 GameRedisSyrnc.get_instance().GetJedis("center").subscribe(new UserScoreLister(), "saveuser","changefail");
		 //GameRedisSyrnc.get_instance().GetJedis("center").subscribe(new UserScoreLister(), "changefail");
		 /*io.nats.client.ConnectionFactory c=new io.nats.client.ConnectionFactory(NatURL);
		 try {
			App.loger.info(io.nats.client.Constants.DEFAULT_URL);
		//	c.setUrl(NatURL);
			//c.setConnectionName(NatURL);
			natcon = c.createConnection();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	 }

}
