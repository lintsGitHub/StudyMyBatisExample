package org.lint.Entity;

public class EcsWeixinQcode {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_qcode.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_qcode.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_qcode.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_qcode.qcode
     *
     * @mbg.generated
     */
    private String qcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_qcode.id
     *
     * @return the value of ecs_weixin_qcode.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_qcode.id
     *
     * @param id the value for ecs_weixin_qcode.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_qcode.type
     *
     * @return the value of ecs_weixin_qcode.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_qcode.type
     *
     * @param type the value for ecs_weixin_qcode.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_qcode.content
     *
     * @return the value of ecs_weixin_qcode.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_qcode.content
     *
     * @param content the value for ecs_weixin_qcode.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_qcode.qcode
     *
     * @return the value of ecs_weixin_qcode.qcode
     *
     * @mbg.generated
     */
    public String getQcode() {
        return qcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_qcode.qcode
     *
     * @param qcode the value for ecs_weixin_qcode.qcode
     *
     * @mbg.generated
     */
    public void setQcode(String qcode) {
        this.qcode = qcode == null ? null : qcode.trim();
    }
}