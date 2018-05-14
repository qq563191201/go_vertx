package com.gojava.db.dao;

import com.gojava.db.model.VipMoney;
import com.gojava.db.model.VipMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipMoneyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    int countByExample(VipMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    int deleteByExample(VipMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    int insert(VipMoney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    int insertSelective(VipMoney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    List<VipMoney> selectByExample(VipMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    VipMoney selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") VipMoney record, @Param("example") VipMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    int updateByExample(@Param("record") VipMoney record, @Param("example") VipMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    int updateByPrimaryKeySelective(VipMoney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    int updateByPrimaryKey(VipMoney record);
}