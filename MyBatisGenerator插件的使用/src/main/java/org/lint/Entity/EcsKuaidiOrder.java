package org.lint.Entity;

import java.math.BigDecimal;

public class EcsKuaidiOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.order_sn
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.send_name
     *
     * @mbg.generated
     */
    private String sendName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.send_tel
     *
     * @mbg.generated
     */
    private String sendTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.send_region_id
     *
     * @mbg.generated
     */
    private Short sendRegionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.send_address
     *
     * @mbg.generated
     */
    private String sendAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.to_name
     *
     * @mbg.generated
     */
    private String toName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.to_tel
     *
     * @mbg.generated
     */
    private String toTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.to_region_id
     *
     * @mbg.generated
     */
    private Short toRegionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.to_address
     *
     * @mbg.generated
     */
    private String toAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.goods_weight
     *
     * @mbg.generated
     */
    private BigDecimal goodsWeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.goods_type
     *
     * @mbg.generated
     */
    private byte[] goodsType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.goods_name
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.package_num
     *
     * @mbg.generated
     */
    private Integer packageNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.start_time
     *
     * @mbg.generated
     */
    private Integer startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.end_time
     *
     * @mbg.generated
     */
    private Integer endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.postman_id
     *
     * @mbg.generated
     */
    private Short postmanId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.order_status
     *
     * @mbg.generated
     */
    private byte[] orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.add_time
     *
     * @mbg.generated
     */
    private Integer addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order.finish_time
     *
     * @mbg.generated
     */
    private Integer finishTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.order_id
     *
     * @return the value of ecs_kuaidi_order.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.order_id
     *
     * @param orderId the value for ecs_kuaidi_order.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.order_sn
     *
     * @return the value of ecs_kuaidi_order.order_sn
     *
     * @mbg.generated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.order_sn
     *
     * @param orderSn the value for ecs_kuaidi_order.order_sn
     *
     * @mbg.generated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.user_id
     *
     * @return the value of ecs_kuaidi_order.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.user_id
     *
     * @param userId the value for ecs_kuaidi_order.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.send_name
     *
     * @return the value of ecs_kuaidi_order.send_name
     *
     * @mbg.generated
     */
    public String getSendName() {
        return sendName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.send_name
     *
     * @param sendName the value for ecs_kuaidi_order.send_name
     *
     * @mbg.generated
     */
    public void setSendName(String sendName) {
        this.sendName = sendName == null ? null : sendName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.send_tel
     *
     * @return the value of ecs_kuaidi_order.send_tel
     *
     * @mbg.generated
     */
    public String getSendTel() {
        return sendTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.send_tel
     *
     * @param sendTel the value for ecs_kuaidi_order.send_tel
     *
     * @mbg.generated
     */
    public void setSendTel(String sendTel) {
        this.sendTel = sendTel == null ? null : sendTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.send_region_id
     *
     * @return the value of ecs_kuaidi_order.send_region_id
     *
     * @mbg.generated
     */
    public Short getSendRegionId() {
        return sendRegionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.send_region_id
     *
     * @param sendRegionId the value for ecs_kuaidi_order.send_region_id
     *
     * @mbg.generated
     */
    public void setSendRegionId(Short sendRegionId) {
        this.sendRegionId = sendRegionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.send_address
     *
     * @return the value of ecs_kuaidi_order.send_address
     *
     * @mbg.generated
     */
    public String getSendAddress() {
        return sendAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.send_address
     *
     * @param sendAddress the value for ecs_kuaidi_order.send_address
     *
     * @mbg.generated
     */
    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress == null ? null : sendAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.to_name
     *
     * @return the value of ecs_kuaidi_order.to_name
     *
     * @mbg.generated
     */
    public String getToName() {
        return toName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.to_name
     *
     * @param toName the value for ecs_kuaidi_order.to_name
     *
     * @mbg.generated
     */
    public void setToName(String toName) {
        this.toName = toName == null ? null : toName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.to_tel
     *
     * @return the value of ecs_kuaidi_order.to_tel
     *
     * @mbg.generated
     */
    public String getToTel() {
        return toTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.to_tel
     *
     * @param toTel the value for ecs_kuaidi_order.to_tel
     *
     * @mbg.generated
     */
    public void setToTel(String toTel) {
        this.toTel = toTel == null ? null : toTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.to_region_id
     *
     * @return the value of ecs_kuaidi_order.to_region_id
     *
     * @mbg.generated
     */
    public Short getToRegionId() {
        return toRegionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.to_region_id
     *
     * @param toRegionId the value for ecs_kuaidi_order.to_region_id
     *
     * @mbg.generated
     */
    public void setToRegionId(Short toRegionId) {
        this.toRegionId = toRegionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.to_address
     *
     * @return the value of ecs_kuaidi_order.to_address
     *
     * @mbg.generated
     */
    public String getToAddress() {
        return toAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.to_address
     *
     * @param toAddress the value for ecs_kuaidi_order.to_address
     *
     * @mbg.generated
     */
    public void setToAddress(String toAddress) {
        this.toAddress = toAddress == null ? null : toAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.goods_weight
     *
     * @return the value of ecs_kuaidi_order.goods_weight
     *
     * @mbg.generated
     */
    public BigDecimal getGoodsWeight() {
        return goodsWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.goods_weight
     *
     * @param goodsWeight the value for ecs_kuaidi_order.goods_weight
     *
     * @mbg.generated
     */
    public void setGoodsWeight(BigDecimal goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.goods_type
     *
     * @return the value of ecs_kuaidi_order.goods_type
     *
     * @mbg.generated
     */
    public byte[] getGoodsType() {
        return goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.goods_type
     *
     * @param goodsType the value for ecs_kuaidi_order.goods_type
     *
     * @mbg.generated
     */
    public void setGoodsType(byte[] goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.goods_name
     *
     * @return the value of ecs_kuaidi_order.goods_name
     *
     * @mbg.generated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.goods_name
     *
     * @param goodsName the value for ecs_kuaidi_order.goods_name
     *
     * @mbg.generated
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.package_num
     *
     * @return the value of ecs_kuaidi_order.package_num
     *
     * @mbg.generated
     */
    public Integer getPackageNum() {
        return packageNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.package_num
     *
     * @param packageNum the value for ecs_kuaidi_order.package_num
     *
     * @mbg.generated
     */
    public void setPackageNum(Integer packageNum) {
        this.packageNum = packageNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.start_time
     *
     * @return the value of ecs_kuaidi_order.start_time
     *
     * @mbg.generated
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.start_time
     *
     * @param startTime the value for ecs_kuaidi_order.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.end_time
     *
     * @return the value of ecs_kuaidi_order.end_time
     *
     * @mbg.generated
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.end_time
     *
     * @param endTime the value for ecs_kuaidi_order.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.money
     *
     * @return the value of ecs_kuaidi_order.money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.money
     *
     * @param money the value for ecs_kuaidi_order.money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.remark
     *
     * @return the value of ecs_kuaidi_order.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.remark
     *
     * @param remark the value for ecs_kuaidi_order.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.postman_id
     *
     * @return the value of ecs_kuaidi_order.postman_id
     *
     * @mbg.generated
     */
    public Short getPostmanId() {
        return postmanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.postman_id
     *
     * @param postmanId the value for ecs_kuaidi_order.postman_id
     *
     * @mbg.generated
     */
    public void setPostmanId(Short postmanId) {
        this.postmanId = postmanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.order_status
     *
     * @return the value of ecs_kuaidi_order.order_status
     *
     * @mbg.generated
     */
    public byte[] getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.order_status
     *
     * @param orderStatus the value for ecs_kuaidi_order.order_status
     *
     * @mbg.generated
     */
    public void setOrderStatus(byte[] orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.add_time
     *
     * @return the value of ecs_kuaidi_order.add_time
     *
     * @mbg.generated
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.add_time
     *
     * @param addTime the value for ecs_kuaidi_order.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order.finish_time
     *
     * @return the value of ecs_kuaidi_order.finish_time
     *
     * @mbg.generated
     */
    public Integer getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order.finish_time
     *
     * @param finishTime the value for ecs_kuaidi_order.finish_time
     *
     * @mbg.generated
     */
    public void setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
    }
}