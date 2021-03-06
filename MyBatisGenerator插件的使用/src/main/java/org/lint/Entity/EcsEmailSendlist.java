package org.lint.Entity;

public class EcsEmailSendlist {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email_sendlist.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email_sendlist.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email_sendlist.template_id
     *
     * @mbg.generated
     */
    private Integer templateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email_sendlist.error
     *
     * @mbg.generated
     */
    private byte[] error;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email_sendlist.pri
     *
     * @mbg.generated
     */
    private Byte pri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email_sendlist.last_send
     *
     * @mbg.generated
     */
    private Integer lastSend;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email_sendlist.supplier_id
     *
     * @mbg.generated
     */
    private Integer supplierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email_sendlist.email_content
     *
     * @mbg.generated
     */
    private String emailContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email_sendlist.id
     *
     * @return the value of ecs_email_sendlist.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email_sendlist.id
     *
     * @param id the value for ecs_email_sendlist.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email_sendlist.email
     *
     * @return the value of ecs_email_sendlist.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email_sendlist.email
     *
     * @param email the value for ecs_email_sendlist.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email_sendlist.template_id
     *
     * @return the value of ecs_email_sendlist.template_id
     *
     * @mbg.generated
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email_sendlist.template_id
     *
     * @param templateId the value for ecs_email_sendlist.template_id
     *
     * @mbg.generated
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email_sendlist.error
     *
     * @return the value of ecs_email_sendlist.error
     *
     * @mbg.generated
     */
    public byte[] getError() {
        return error;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email_sendlist.error
     *
     * @param error the value for ecs_email_sendlist.error
     *
     * @mbg.generated
     */
    public void setError(byte[] error) {
        this.error = error;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email_sendlist.pri
     *
     * @return the value of ecs_email_sendlist.pri
     *
     * @mbg.generated
     */
    public Byte getPri() {
        return pri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email_sendlist.pri
     *
     * @param pri the value for ecs_email_sendlist.pri
     *
     * @mbg.generated
     */
    public void setPri(Byte pri) {
        this.pri = pri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email_sendlist.last_send
     *
     * @return the value of ecs_email_sendlist.last_send
     *
     * @mbg.generated
     */
    public Integer getLastSend() {
        return lastSend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email_sendlist.last_send
     *
     * @param lastSend the value for ecs_email_sendlist.last_send
     *
     * @mbg.generated
     */
    public void setLastSend(Integer lastSend) {
        this.lastSend = lastSend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email_sendlist.supplier_id
     *
     * @return the value of ecs_email_sendlist.supplier_id
     *
     * @mbg.generated
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email_sendlist.supplier_id
     *
     * @param supplierId the value for ecs_email_sendlist.supplier_id
     *
     * @mbg.generated
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email_sendlist.email_content
     *
     * @return the value of ecs_email_sendlist.email_content
     *
     * @mbg.generated
     */
    public String getEmailContent() {
        return emailContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email_sendlist.email_content
     *
     * @param emailContent the value for ecs_email_sendlist.email_content
     *
     * @mbg.generated
     */
    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent == null ? null : emailContent.trim();
    }
}