package com.google.code.proto.gcless;

import java.util.ArrayList;
import java.util.List;

final class ProtobufMessage {

	
	private String recvPackage;
	
	public String getRecvPackage() {
		return recvPackage;
	}
	public void setRecvPackage(String recvPackage) {
		this.recvPackage = recvPackage;
	}

	private String recvMsgName;
	private String name;
	private String fullyClarifiedJavaName;
	private String fullyClarifiedProtoName;
	private boolean group;

	 
	private String httpMethod;
	public String getHttpMethod() {
		return httpMethod;
	}
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}
	public String getProtoNumber() {
		return protoNumber;
	}
	public void setProtoNumber(String protoNumber) {
		this.protoNumber = protoNumber;
	}

	private String protoNumber;
	
	
	
	private final List<ProtobufMessage> nestedMessages = new ArrayList<ProtobufMessage>();
	private final List<ProtobufEnum> enums = new ArrayList<ProtobufEnum>();
	private final List<ProtobufField> fields = new ArrayList<ProtobufField>();

	public void setRecvMsgName(String recvname){
		recvMsgName=recvname;
		
	}
	public String getRecvMsgName(){
		return recvMsgName;
	}
	public boolean isGroup() {
		return group;
	}
	
	public void setGroup(boolean group) {
		this.group = group;
	}
	
	public String getFullyClarifiedProtoName() {
		return fullyClarifiedProtoName;
	}
	
	public void setFullyClarifiedProtoName(String fullyClarifiedProtoName) {
		this.fullyClarifiedProtoName = fullyClarifiedProtoName;
	}
	
	public String getFullyClarifiedJavaName() {
		return fullyClarifiedJavaName;
	}

	public void setFullyClarifiedJavaName(String fullyClarifiedName) {
		this.fullyClarifiedJavaName = fullyClarifiedName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProtobufMessage> getNestedMessages() {
		return nestedMessages;
	}

	public List<ProtobufEnum> getEnums() {
		return enums;
	}

	public void addNestedMessage(ProtobufMessage message) {
		nestedMessages.add(message);
	}

	public void addEnum(ProtobufEnum curEnum) {
		enums.add(curEnum);
	}

	public void addField(ProtobufField field) {
		fields.add(field);
	}

	public List<ProtobufField> getFields() {
		return fields;
	}

	@Override
	public String toString() {
		return name;
	}
}
