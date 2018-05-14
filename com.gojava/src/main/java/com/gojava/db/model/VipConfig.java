package com.gojava.db.model;

import java.io.Serializable;

public class VipConfig implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_config.id
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_config.convert_value
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    private Double convertValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_config.name
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vip_config
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_config.id
     *
     * @return the value of vip_config.id
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_config.id
     *
     * @param id the value for vip_config.id
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_config.convert_value
     *
     * @return the value of vip_config.convert_value
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public Double getConvertValue() {
        return convertValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_config.convert_value
     *
     * @param convertValue the value for vip_config.convert_value
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public void setConvertValue(Double convertValue) {
        this.convertValue = convertValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_config.name
     *
     * @return the value of vip_config.name
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_config.name
     *
     * @param name the value for vip_config.name
     *
     * @mbggenerated Fri Dec 29 11:57:31 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }
}