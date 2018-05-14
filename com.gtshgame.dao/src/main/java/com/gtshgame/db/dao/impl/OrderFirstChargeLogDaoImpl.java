package com.gtshgame.db.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.gtshgame.common.bean.OrderFirstChargeLog;
import com.gtshgame.db.dao.OrderFirstChargeLogDao;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

@Repository("orderFirstChargeLogDao")
public class OrderFirstChargeLogDaoImpl extends AbstractDao<OrderFirstChargeLog> implements OrderFirstChargeLogDao {
	
	@Resource
    private SqlSessionTemplate houtaiSqlSessionTemplate;

	@Override
	protected SqlSessionTemplate getSqlSessionTemplate() {
		return houtaiSqlSessionTemplate;
	}
	
	@Override
	protected String getNamespace() {
		return "atomikosorderFirstChargeLogDao";
	}

	public int insert(OrderFirstChargeLog entity) {
		return super.insert(entity);
	}
	
}
