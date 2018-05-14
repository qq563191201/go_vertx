package com.gtshgame.db.dao;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

public interface DAO<E> {
	
	public String getSequence();
	
	public int insert(E entity);

}
