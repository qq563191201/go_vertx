package com.gojava.com.gojava;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Properties;


import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.support.PropertiesLoaderSupport;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.gojava.vertx.GoHttpServer;

import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.Log4JLoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.net.JksOptions;
import ratpack.func.Action;
import ratpack.handling.Chain;
import ratpack.server.RatpackServer;

/**
 * Hello world!
 *
 */
//@EnableAutoConfiguration
@SpringBootApplication
@SuppressWarnings("unused")
//@EnableAutoConfiguration(exclude={EmbeddedWebApplicationContext.class})
@ComponentScan(basePackages = "com.gojava.msg.controllers,com.gojava.vertx,com.gojava.component,com.gojava.vertx.config")
public class App 
{

     
    private static Properties properties=new Properties();  
    static public void GetProps() {  
        try{  
            // get the names of BeanFactoryPostProcessor  
            String[] postProcessorNames = abstractContext  
                    .getBeanNamesForType(BeanFactoryPostProcessor.class,true,true);  
              
            for (String ppName : postProcessorNames) {  
                // get the specified BeanFactoryPostProcessor  
                BeanFactoryPostProcessor beanProcessor=  
                abstractContext.getBean(ppName, BeanFactoryPostProcessor.class);  
                // check whether the beanFactoryPostProcessor is   
                // instance of the PropertyResourceConfigurer  
                // if it is yes then do the process otherwise continue  
                if(beanProcessor instanceof PropertyResourceConfigurer){  
                    PropertyResourceConfigurer propertyResourceConfigurer=  
                            (PropertyResourceConfigurer) beanProcessor;  
                      
                    // get the method mergeProperties   
                    // in class PropertiesLoaderSupport  
                    Method mergeProperties=PropertiesLoaderSupport.class.  
                        getDeclaredMethod("mergeProperties");  
                    // get the props  
                    mergeProperties.setAccessible(true);  
                    Properties props=(Properties) mergeProperties.  
                    invoke(propertyResourceConfigurer);  
                      
                    // get the method convertProperties   
                    // in class PropertyResourceConfigurer  
                    Method convertProperties=PropertyResourceConfigurer.class.  
                    getDeclaredMethod("convertProperties", Properties.class);  
                    // convert properties  
                    convertProperties.setAccessible(true);  
                    convertProperties.invoke(propertyResourceConfigurer, props);  
                      
                    properties.putAll(props);  
                }  
            }  
              
        }catch(Exception e){  
            throw new RuntimeException(e);  
        }  
    }  
      
    public static String getProperty(String propertyName){  
        return properties.getProperty(propertyName);  
    } 
	static Vertx vertx;
	public static Vertx getVertx() {
				return vertx;
	}
	public static void setVertx(Vertx vertx) {
		vertx = vertx;
	}
	 private static AbstractApplicationContext abstractContext;
	static GoHttpServer http;
	private static final String RESOURCE = "resource";
	public static Logger loger;//=Logger.getLogger(App.class);
	public static  ApplicationContext context;
    @SuppressWarnings(RESOURCE)
	public static void main( String[] args )
    {
    	
    
    
    	context =
    		    new ClassPathXmlApplicationContext(new String[] {"interfaces.xml","autobean.xml","bean_logic.xml","mybaitsMapper.xml"});
    	abstractContext =      (AbstractApplicationContext) context;
    	vertx=Vertx.vertx(new VertxOptions().setWorkerPoolSize(40));
    	//org.apache.log4j.PropertyConfigurator.
    	/* InputStream is=  App.class.getResourceAsStream("../../../../log4j.properties");
		  BufferedReader br=new BufferedReader(new InputStreamReader(is));  
		  try {
			String s=br.readLine();
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		8
    	 Properties ps=new Properties();
    	 try {
			ps.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	PropertyConfigurator.configure(ps);
    */
    	//InternalLoggerFactory.setDefaultFactory(Log4JLoggerFactory.INSTANCE);
    	//PropertyConfigurator.configure("log4j.properties");
    	 loger= LoggerFactory.getLogger(App.class);  
    	 GetProps();
    	 
    	http=new GoHttpServer();
    	try{
    		http.start();
    		loger.debug("启动服务............");
    	
    	}catch(Exception ex){
    		loger.error("e",ex);
    		//loger.warn(arg0);
    	}
    //	org.springframework.boot.SpringApplication.run(App.class, args);
    }
}
