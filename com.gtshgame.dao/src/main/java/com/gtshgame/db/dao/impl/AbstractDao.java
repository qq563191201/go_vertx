package com.gtshgame.db.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.gtshgame.common.util.StringUtil;
import com.gtshgame.db.dao.DAO;



/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

public abstract class AbstractDao<E> implements DAO<E> {

	protected abstract SqlSessionTemplate getSqlSessionTemplate();

	protected abstract String getNamespace();
	
	public String getSequence() {
		return StringUtil.getUUID();
	}
	
	public int insert(E entity) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("entity", entity);
		String nameSpace = getNamespace();
		SqlSessionTemplate sqlSessionTemplate = getSqlSessionTemplate();
		return sqlSessionTemplate.insert(nameSpace + ".insert",
				params);
	}

}
