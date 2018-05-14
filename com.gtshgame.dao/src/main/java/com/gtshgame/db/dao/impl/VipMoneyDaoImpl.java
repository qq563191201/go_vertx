package com.gtshgame.db.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.gtshgame.common.bean.OrderFirstChargeLog;
import com.gtshgame.common.bean.VipMoney;
import com.gtshgame.db.dao.OrderFirstChargeLogDao;
import com.gtshgame.db.dao.VipMoneyDao;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

@Repository("vipMoneyDao")
public class VipMoneyDaoImpl extends AbstractDao<VipMoney> implements VipMoneyDao {
	
	@Resource
    private SqlSessionTemplate activitySqlSessionTemplate;

	@Override
	protected SqlSessionTemplate getSqlSessionTemplate() {
		return activitySqlSessionTemplate;
	}
	
	@Override
	protected String getNamespace() {
		return "atomikosvipMoneyDao";
	}

	public int insert(VipMoney entity) {
		return super.insert(entity);
	}
	
}
