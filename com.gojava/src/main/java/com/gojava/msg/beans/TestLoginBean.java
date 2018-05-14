package com.gojava.msg.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.gojava.interfaces.MsgInterface;

public class TestLoginBean implements ApplicationContextAware,MsgInterface<String,String> {

	ApplicationContext ctx;
	@Override
	public String ProcessMsgInfo(String o) {
		// TODO Auto-generated method stub
		 MsgInterface<String,String> i=new TestLoginBean();
		i.ProcessMsgInfo("aa");
		return null;
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		ctx=arg0;
		
	}

}
