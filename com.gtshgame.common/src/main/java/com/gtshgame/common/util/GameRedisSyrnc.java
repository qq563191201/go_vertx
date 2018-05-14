package com.gtshgame.common.util;

import java.util.Map;

import org.apache.log4j.Logger;

import redis.clients.jedis.Jedis;

public class GameRedisSyrnc {
	static GameRedisSyrnc _instance=null;
	String name;
	
	public static GameRedisSyrnc get_instance_center() {
		return getinstance("center");
	}
	Logger loger=Logger.getLogger(GameRedisSyrnc.class);
	private GameRedisSyrnc(){}
	private synchronized static  GameRedisSyrnc getinstance(String name){
		if(_instance==null) {
			_instance=new GameRedisSyrnc();
		}
		_instance.name = name;
		return _instance;
	}
	public void addGameRedis(String Name,String Host,int port, String pwd){
		
		JRedisTable.get_instance().addRedis(Name, Host, port, pwd);
	}
	public Jedis GetJedis(){
		return JRedisTable.get_instance().getJedis(name);
	}
	
	/**
	 * @Title: 判断key值是否存在
	 * @Description:
	 * @param key
	 * @return
	 * @author Horst
	 * @date 2017年12月29日 上午11:31:08
	 * @version V1.0
	 */
	public boolean existsKey(String key) {
		Jedis je = JRedisTable.get_instance().getJedis(name);	
		return je.exists(key);
	}
	
	/**
	 * @Title: 设置value
	 * @Description:
	 * @param name
	 * @param key
	 * @param value
	 * @author Horst
	 * @date 2017年12月27日 下午2:10:52
	 * @version V1.0
	 */
	public void setString(String key,String value) {
		Jedis je = JRedisTable.get_instance().getJedis(name);	
		je.set(key, value);
	}
	
	/**
	 * @Title: 获取String值
	 * @Description:
	 * @param name
	 * @param key
	 * @return
	 * @author Horst
	 * @date 2017年12月27日 下午2:11:58
	 * @version V1.0
	 */
	public String getString(String key) {
		Jedis je = JRedisTable.get_instance().getJedis(name);	
		return je.get(key);
	}
	
	/**
	 * @Title: 删除string key
	 * @Description:
	 * @param name
	 * @param key
	 * @author Horst
	 * @date 2017年12月27日 下午2:19:19
	 * @version V1.0
	 */
	public void delString(String... key) {
		Jedis je = JRedisTable.get_instance().getJedis(name);	
		je.del(key);
	}
	
	/**
	 * @Title: hashmap设置值
	 * @Description:
	 * @param name
	 * @param key
	 * @param id
	 * @param value
	 * @author Horst
	 * @date 2017年12月27日 上午11:25:46
	 * @version V1.0
	 */
	public void setHashMap(String key,String id, String value){
		Jedis je = JRedisTable.get_instance().getJedis(name);	
		je.hset(key, id, value);
	}
	
	/**
	 * @Title: hash批量入库
	 * @Description:
	 * @param key
	 * @param map
	 * @author Horst
	 * @date 2017年12月29日 下午12:05:21
	 * @version V1.0
	 */
	public void hmset(String key, Map<String, String> map) {
		Jedis je = JRedisTable.get_instance().getJedis(name);	
		je.hmset(key, map);
	}
	
	/**
	 * @Title: 根据key、fields获取hash值
	 * @Description:
	 * @param name
	 * @param key
	 * @param fields
	 * @param value
	 * @return
	 * @author Horst
	 * @date 2017年12月27日 上午11:45:44
	 * @version V1.0
	 */
	public String getHashMap(String key,String fields){
		Jedis je = JRedisTable.get_instance().getJedis(name);	
		return je.hget(key, fields);
	}
	
	/**
	 * @Title: 返回map所有键值
	 * @Description:
	 * @param name
	 * @param key
	 * @return
	 * @author Horst
	 * @date 2017年12月27日 下午8:05:28
	 * @version V1.0
	 */
	public Map<String, String> getHashMapAll(String key){
		Jedis je = JRedisTable.get_instance().getJedis(name);	
		return je.hgetAll(key);
	}
	
	/**
	 * @Title: 删除集合中fields值
	 * @Description:
	 * @param name
	 * @param key
	 * @param fields
	 * @author Horst
	 * @date 2017年12月27日 下午2:20:38
	 * @version V1.0
	 */
	public void delHashMap(String key,String fields) {
		Jedis je = JRedisTable.get_instance().getJedis(name);
		je.hdel(key, fields);
	}
	
	/**
	 * @Title: 将value加入set集合中
	 * @Description:
	 * @param name
	 * @param key
	 * @param value
	 * @author Horst
	 * @date 2017年12月27日 上午11:35:42
	 * @version V1.0
	 */
	public void setHashSet(String key, String member){
		Jedis je = JRedisTable.get_instance().getJedis(name);	
		je.sadd(key, member);
	}
	
	/**
	 * @Title: 判断member是否在集合中
	 * @Description:
	 * @param name
	 * @param key
	 * @param member
	 * @return
	 * @author Horst
	 * @date 2017年12月27日 下午2:08:18
	 * @version V1.0
	 */
	public boolean isHashSet(String key, String member) {
		Jedis je = JRedisTable.get_instance().getJedis(name);
		return je.sismember(key, member);
	}
	
	/**
	 * @Title: 删除set集合元素
	 * @Description:
	 * @param name
	 * @param key
	 * @param member
	 * @author Horst
	 * @date 2017年12月27日 下午2:28:59
	 * @version V1.0
	 */
	public void delHashSet(String key, String member) {
		Jedis je = JRedisTable.get_instance().getJedis(name);
		je.srem(key, member);
	}
	
	/**
	 * @Title: 设置key过期时间
	 * @Description:
	 * @param name
	 * @param key
	 * @param seconds /秒
	 * @author Horst
	 * @date 2017年12月27日 下午2:29:22
	 * @version V1.0
	 */
	public void setExpire(String key, int seconds) {
		Jedis je = JRedisTable.get_instance().getJedis(name);
		je.expire(key, seconds);
	}
}
