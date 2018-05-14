package com.gojava.db.model;

import java.io.Serializable;
import java.util.Date;

public class OrderFirstChargeLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_first_charge_log.user_id
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_first_charge_log.order_no
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    private String orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_first_charge_log.money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    private Double money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_first_charge_log.create_datetime
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    private Date createDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_first_charge_log
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_first_charge_log.user_id
     *
     * @return the value of order_first_charge_log.user_id
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_first_charge_log.user_id
     *
     * @param userId the value for order_first_charge_log.user_id
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_first_charge_log.order_no
     *
     * @return the value of order_first_charge_log.order_no
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_first_charge_log.order_no
     *
     * @param orderNo the value for order_first_charge_log.order_no
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_first_charge_log.money
     *
     * @return the value of order_first_charge_log.money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public Double getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_first_charge_log.money
     *
     * @param money the value for order_first_charge_log.money
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_first_charge_log.create_datetime
     *
     * @return the value of order_first_charge_log.create_datetime
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_first_charge_log.create_datetime
     *
     * @param createDatetime the value for order_first_charge_log.create_datetime
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}