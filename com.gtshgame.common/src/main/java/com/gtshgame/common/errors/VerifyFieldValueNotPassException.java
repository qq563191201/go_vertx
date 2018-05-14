package com.gtshgame.common.errors;

public class VerifyFieldValueNotPassException extends Exception  {

	/**
	 * 
	 */
	String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private static final long serialVersionUID = 7862786723996600330L;
	public VerifyFieldValueNotPassException(String ex){
		content=ex;
		
	}

}
