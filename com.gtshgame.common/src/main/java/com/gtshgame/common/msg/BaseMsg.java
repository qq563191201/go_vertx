package com.gtshgame.common.msg;

public class BaseMsg {
	
	private boolean success = false;//true成功
	private String msg;//错误内容
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
