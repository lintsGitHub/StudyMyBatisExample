package org.lint.Entity;

import java.math.BigDecimal;

public class EcsBonusType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.type_id
     *
     * @mbg.generated
     */
    private Short typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.type_name
     *
     * @mbg.generated
     */
    private String typeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.type_money
     *
     * @mbg.generated
     */
    private BigDecimal typeMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.send_type
     *
     * @mbg.generated
     */
    private Byte sendType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.min_amount
     *
     * @mbg.generated
     */
    private BigDecimal minAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.max_amount
     *
     * @mbg.generated
     */
    private BigDecimal maxAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.send_start_date
     *
     * @mbg.generated
     */
    private Integer sendStartDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.send_end_date
     *
     * @mbg.generated
     */
    private Integer sendEndDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.use_start_date
     *
     * @mbg.generated
     */
    private Integer useStartDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.use_end_date
     *
     * @mbg.generated
     */
    private Integer useEndDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.min_goods_amount
     *
     * @mbg.generated
     */
    private BigDecimal minGoodsAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.supplier_id
     *
     * @mbg.generated
     */
    private Integer supplierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.bonus_code
     *
     * @mbg.generated
     */
    private String bonusCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bonus_type.user_bonus_max
     *
     * @mbg.generated
     */
    private Integer userBonusMax;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.type_id
     *
     * @return the value of ecs_bonus_type.type_id
     *
     * @mbg.generated
     */
    public Short getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.type_id
     *
     * @param typeId the value for ecs_bonus_type.type_id
     *
     * @mbg.generated
     */
    public void setTypeId(Short typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.type_name
     *
     * @return the value of ecs_bonus_type.type_name
     *
     * @mbg.generated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.type_name
     *
     * @param typeName the value for ecs_bonus_type.type_name
     *
     * @mbg.generated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.type_money
     *
     * @return the value of ecs_bonus_type.type_money
     *
     * @mbg.generated
     */
    public BigDecimal getTypeMoney() {
        return typeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.type_money
     *
     * @param typeMoney the value for ecs_bonus_type.type_money
     *
     * @mbg.generated
     */
    public void setTypeMoney(BigDecimal typeMoney) {
        this.typeMoney = typeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.send_type
     *
     * @return the value of ecs_bonus_type.send_type
     *
     * @mbg.generated
     */
    public Byte getSendType() {
        return sendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.send_type
     *
     * @param sendType the value for ecs_bonus_type.send_type
     *
     * @mbg.generated
     */
    public void setSendType(Byte sendType) {
        this.sendType = sendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.min_amount
     *
     * @return the value of ecs_bonus_type.min_amount
     *
     * @mbg.generated
     */
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.min_amount
     *
     * @param minAmount the value for ecs_bonus_type.min_amount
     *
     * @mbg.generated
     */
    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.max_amount
     *
     * @return the value of ecs_bonus_type.max_amount
     *
     * @mbg.generated
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.max_amount
     *
     * @param maxAmount the value for ecs_bonus_type.max_amount
     *
     * @mbg.generated
     */
    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.send_start_date
     *
     * @return the value of ecs_bonus_type.send_start_date
     *
     * @mbg.generated
     */
    public Integer getSendStartDate() {
        return sendStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.send_start_date
     *
     * @param sendStartDate the value for ecs_bonus_type.send_start_date
     *
     * @mbg.generated
     */
    public void setSendStartDate(Integer sendStartDate) {
        this.sendStartDate = sendStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.send_end_date
     *
     * @return the value of ecs_bonus_type.send_end_date
     *
     * @mbg.generated
     */
    public Integer getSendEndDate() {
        return sendEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.send_end_date
     *
     * @param sendEndDate the value for ecs_bonus_type.send_end_date
     *
     * @mbg.generated
     */
    public void setSendEndDate(Integer sendEndDate) {
        this.sendEndDate = sendEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.use_start_date
     *
     * @return the value of ecs_bonus_type.use_start_date
     *
     * @mbg.generated
     */
    public Integer getUseStartDate() {
        return useStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.use_start_date
     *
     * @param useStartDate the value for ecs_bonus_type.use_start_date
     *
     * @mbg.generated
     */
    public void setUseStartDate(Integer useStartDate) {
        this.useStartDate = useStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.use_end_date
     *
     * @return the value of ecs_bonus_type.use_end_date
     *
     * @mbg.generated
     */
    public Integer getUseEndDate() {
        return useEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.use_end_date
     *
     * @param useEndDate the value for ecs_bonus_type.use_end_date
     *
     * @mbg.generated
     */
    public void setUseEndDate(Integer useEndDate) {
        this.useEndDate = useEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.min_goods_amount
     *
     * @return the value of ecs_bonus_type.min_goods_amount
     *
     * @mbg.generated
     */
    public BigDecimal getMinGoodsAmount() {
        return minGoodsAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.min_goods_amount
     *
     * @param minGoodsAmount the value for ecs_bonus_type.min_goods_amount
     *
     * @mbg.generated
     */
    public void setMinGoodsAmount(BigDecimal minGoodsAmount) {
        this.minGoodsAmount = minGoodsAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.supplier_id
     *
     * @return the value of ecs_bonus_type.supplier_id
     *
     * @mbg.generated
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.supplier_id
     *
     * @param supplierId the value for ecs_bonus_type.supplier_id
     *
     * @mbg.generated
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.bonus_code
     *
     * @return the value of ecs_bonus_type.bonus_code
     *
     * @mbg.generated
     */
    public String getBonusCode() {
        return bonusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.bonus_code
     *
     * @param bonusCode the value for ecs_bonus_type.bonus_code
     *
     * @mbg.generated
     */
    public void setBonusCode(String bonusCode) {
        this.bonusCode = bonusCode == null ? null : bonusCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bonus_type.user_bonus_max
     *
     * @return the value of ecs_bonus_type.user_bonus_max
     *
     * @mbg.generated
     */
    public Integer getUserBonusMax() {
        return userBonusMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bonus_type.user_bonus_max
     *
     * @param userBonusMax the value for ecs_bonus_type.user_bonus_max
     *
     * @mbg.generated
     */
    public void setUserBonusMax(Integer userBonusMax) {
        this.userBonusMax = userBonusMax;
    }
}