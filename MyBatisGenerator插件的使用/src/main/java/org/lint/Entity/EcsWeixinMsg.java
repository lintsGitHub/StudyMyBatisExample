package org.lint.Entity;

import java.util.Date;

public class EcsWeixinMsg {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_msg.msgid
     *
     * @mbg.generated
     */
    private Integer msgid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_msg.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_msg.fake_id
     *
     * @mbg.generated
     */
    private String fakeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_msg.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_msg.createtime
     *
     * @mbg.generated
     */
    private Integer createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_msg.createymd
     *
     * @mbg.generated
     */
    private Date createymd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_msg.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_msg.msgid
     *
     * @return the value of ecs_weixin_msg.msgid
     *
     * @mbg.generated
     */
    public Integer getMsgid() {
        return msgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_msg.msgid
     *
     * @param msgid the value for ecs_weixin_msg.msgid
     *
     * @mbg.generated
     */
    public void setMsgid(Integer msgid) {
        this.msgid = msgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_msg.uid
     *
     * @return the value of ecs_weixin_msg.uid
     *
     * @mbg.generated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_msg.uid
     *
     * @param uid the value for ecs_weixin_msg.uid
     *
     * @mbg.generated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_msg.fake_id
     *
     * @return the value of ecs_weixin_msg.fake_id
     *
     * @mbg.generated
     */
    public String getFakeId() {
        return fakeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_msg.fake_id
     *
     * @param fakeId the value for ecs_weixin_msg.fake_id
     *
     * @mbg.generated
     */
    public void setFakeId(String fakeId) {
        this.fakeId = fakeId == null ? null : fakeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_msg.type
     *
     * @return the value of ecs_weixin_msg.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_msg.type
     *
     * @param type the value for ecs_weixin_msg.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_msg.createtime
     *
     * @return the value of ecs_weixin_msg.createtime
     *
     * @mbg.generated
     */
    public Integer getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_msg.createtime
     *
     * @param createtime the value for ecs_weixin_msg.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_msg.createymd
     *
     * @return the value of ecs_weixin_msg.createymd
     *
     * @mbg.generated
     */
    public Date getCreateymd() {
        return createymd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_msg.createymd
     *
     * @param createymd the value for ecs_weixin_msg.createymd
     *
     * @mbg.generated
     */
    public void setCreateymd(Date createymd) {
        this.createymd = createymd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_msg.content
     *
     * @return the value of ecs_weixin_msg.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_msg.content
     *
     * @param content the value for ecs_weixin_msg.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}