package com.gojava.util;

import java.util.regex.Pattern;

public final class VarVerfiyValue {
	public static boolean Clamp(int val,int max,int min){
		return val>=min&&val<=max;
	}
	public static boolean Clamp(long val,long max,long min){
		return val>=min&&val<=max;
	}
	public static boolean Clamp(float val,float max,float min){
		return val>=min&&val<=max;
	}
	public static boolean Clamp(double val,double max,double min){
		return val>=min&&val<=max;
	}
	public static boolean Clamp(short val,short max,short min){
		
		return val>=min&&val<=max;
	}
	public static boolean Clamp(byte val,byte max,byte min){
		return val>=min&&val<=max;
	}
	@SuppressWarnings("static-access")
	public static boolean StringRegx(String val,int maxlen,int minlen,String strregx){
		if(val==null)
			return true;
		boolean rs=true;
		rs = val.length() >=minlen&&val.length()<=maxlen;
		if(!strregx.isEmpty()){
			 Pattern pattern = Pattern.compile(strregx); 
			 rs=pattern.matches(strregx, val);
		}
		return rs;
		
	}
	
}
