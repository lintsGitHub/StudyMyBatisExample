package org.lint.Entity;

import java.math.BigDecimal;

public class EcsSessions {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions.sesskey
     *
     * @mbg.generated
     */
    private String sesskey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions.expiry
     *
     * @mbg.generated
     */
    private Integer expiry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions.userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions.adminid
     *
     * @mbg.generated
     */
    private Integer adminid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions.user_rank
     *
     * @mbg.generated
     */
    private Byte userRank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions.discount
     *
     * @mbg.generated
     */
    private BigDecimal discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions.data
     *
     * @mbg.generated
     */
    private String data;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions.sesskey
     *
     * @return the value of ecs_sessions.sesskey
     *
     * @mbg.generated
     */
    public String getSesskey() {
        return sesskey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions.sesskey
     *
     * @param sesskey the value for ecs_sessions.sesskey
     *
     * @mbg.generated
     */
    public void setSesskey(String sesskey) {
        this.sesskey = sesskey == null ? null : sesskey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions.expiry
     *
     * @return the value of ecs_sessions.expiry
     *
     * @mbg.generated
     */
    public Integer getExpiry() {
        return expiry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions.expiry
     *
     * @param expiry the value for ecs_sessions.expiry
     *
     * @mbg.generated
     */
    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions.userid
     *
     * @return the value of ecs_sessions.userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions.userid
     *
     * @param userid the value for ecs_sessions.userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions.adminid
     *
     * @return the value of ecs_sessions.adminid
     *
     * @mbg.generated
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions.adminid
     *
     * @param adminid the value for ecs_sessions.adminid
     *
     * @mbg.generated
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions.ip
     *
     * @return the value of ecs_sessions.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions.ip
     *
     * @param ip the value for ecs_sessions.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions.user_name
     *
     * @return the value of ecs_sessions.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions.user_name
     *
     * @param userName the value for ecs_sessions.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions.user_rank
     *
     * @return the value of ecs_sessions.user_rank
     *
     * @mbg.generated
     */
    public Byte getUserRank() {
        return userRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions.user_rank
     *
     * @param userRank the value for ecs_sessions.user_rank
     *
     * @mbg.generated
     */
    public void setUserRank(Byte userRank) {
        this.userRank = userRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions.discount
     *
     * @return the value of ecs_sessions.discount
     *
     * @mbg.generated
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions.discount
     *
     * @param discount the value for ecs_sessions.discount
     *
     * @mbg.generated
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions.email
     *
     * @return the value of ecs_sessions.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions.email
     *
     * @param email the value for ecs_sessions.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions.data
     *
     * @return the value of ecs_sessions.data
     *
     * @mbg.generated
     */
    public String getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions.data
     *
     * @param data the value for ecs_sessions.data
     *
     * @mbg.generated
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}