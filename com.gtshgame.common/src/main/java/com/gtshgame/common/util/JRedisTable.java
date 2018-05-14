package com.gtshgame.common.util;

import java.util.HashSet;

import redis.clients.jedis.Jedis;

public class JRedisTable {

	
	java.util.Map<String, Jedis> m_redisTable;

	static JRedisTable _instance=null;

	private JRedisTable(){

		m_redisTable=new java.util.concurrent.ConcurrentHashMap<String, Jedis>();
		
	}
	
	private synchronized static JRedisTable getinstance(){
		if(_instance==null)
			_instance=new JRedisTable();
		return _instance;
	}
	
	public static JRedisTable get_instance() {
		return getinstance();
	}
	public void addRedis(String Name,String Host,int port,String pwd){
		Jedis tmpj=new Jedis(Host,port);
		if(!(pwd!=null?pwd:"").equals("")) {
			tmpj.auth(pwd);
		}
		tmpj.connect();
		m_redisTable.put(Name,tmpj);
	}
	public Jedis getJedis(String Name){
		if(this.m_redisTable.containsKey(Name))
			return this.m_redisTable.get(Name);
		return null;
	}
	
}
