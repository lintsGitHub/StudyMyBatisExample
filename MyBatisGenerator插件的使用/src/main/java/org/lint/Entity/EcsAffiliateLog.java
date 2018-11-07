package org.lint.Entity;

import java.math.BigDecimal;

public class EcsAffiliateLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.log_id
     *
     * @mbg.generated
     */
    private Integer logId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.time
     *
     * @mbg.generated
     */
    private Integer time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.point
     *
     * @mbg.generated
     */
    private Integer point;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.separate_type
     *
     * @mbg.generated
     */
    private byte[] separateType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.log_id
     *
     * @return the value of ecs_affiliate_log.log_id
     *
     * @mbg.generated
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.log_id
     *
     * @param logId the value for ecs_affiliate_log.log_id
     *
     * @mbg.generated
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.order_id
     *
     * @return the value of ecs_affiliate_log.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.order_id
     *
     * @param orderId the value for ecs_affiliate_log.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.time
     *
     * @return the value of ecs_affiliate_log.time
     *
     * @mbg.generated
     */
    public Integer getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.time
     *
     * @param time the value for ecs_affiliate_log.time
     *
     * @mbg.generated
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.user_id
     *
     * @return the value of ecs_affiliate_log.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.user_id
     *
     * @param userId the value for ecs_affiliate_log.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.user_name
     *
     * @return the value of ecs_affiliate_log.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.user_name
     *
     * @param userName the value for ecs_affiliate_log.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.money
     *
     * @return the value of ecs_affiliate_log.money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.money
     *
     * @param money the value for ecs_affiliate_log.money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.point
     *
     * @return the value of ecs_affiliate_log.point
     *
     * @mbg.generated
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.point
     *
     * @param point the value for ecs_affiliate_log.point
     *
     * @mbg.generated
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.separate_type
     *
     * @return the value of ecs_affiliate_log.separate_type
     *
     * @mbg.generated
     */
    public byte[] getSeparateType() {
        return separateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.separate_type
     *
     * @param separateType the value for ecs_affiliate_log.separate_type
     *
     * @mbg.generated
     */
    public void setSeparateType(byte[] separateType) {
        this.separateType = separateType;
    }
}