package org.lint.Entity;

import java.util.Date;

public class EcsEgoQaQuestion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.keywords
     *
     * @mbg.generated
     */
    private String keywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.tags_id
     *
     * @mbg.generated
     */
    private String tagsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.favor_times
     *
     * @mbg.generated
     */
    private Integer favorTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.share_times
     *
     * @mbg.generated
     */
    private Integer shareTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.userhost
     *
     * @mbg.generated
     */
    private String userhost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.useragent
     *
     * @mbg.generated
     */
    private String useragent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.userloc
     *
     * @mbg.generated
     */
    private String userloc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.deleted_at
     *
     * @mbg.generated
     */
    private Date deletedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_qa_question.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.id
     *
     * @return the value of ecs_ego_qa_question.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.id
     *
     * @param id the value for ecs_ego_qa_question.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.title
     *
     * @return the value of ecs_ego_qa_question.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.title
     *
     * @param title the value for ecs_ego_qa_question.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.user_id
     *
     * @return the value of ecs_ego_qa_question.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.user_id
     *
     * @param userId the value for ecs_ego_qa_question.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.keywords
     *
     * @return the value of ecs_ego_qa_question.keywords
     *
     * @mbg.generated
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.keywords
     *
     * @param keywords the value for ecs_ego_qa_question.keywords
     *
     * @mbg.generated
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.status
     *
     * @return the value of ecs_ego_qa_question.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.status
     *
     * @param status the value for ecs_ego_qa_question.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.tags_id
     *
     * @return the value of ecs_ego_qa_question.tags_id
     *
     * @mbg.generated
     */
    public String getTagsId() {
        return tagsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.tags_id
     *
     * @param tagsId the value for ecs_ego_qa_question.tags_id
     *
     * @mbg.generated
     */
    public void setTagsId(String tagsId) {
        this.tagsId = tagsId == null ? null : tagsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.favor_times
     *
     * @return the value of ecs_ego_qa_question.favor_times
     *
     * @mbg.generated
     */
    public Integer getFavorTimes() {
        return favorTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.favor_times
     *
     * @param favorTimes the value for ecs_ego_qa_question.favor_times
     *
     * @mbg.generated
     */
    public void setFavorTimes(Integer favorTimes) {
        this.favorTimes = favorTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.share_times
     *
     * @return the value of ecs_ego_qa_question.share_times
     *
     * @mbg.generated
     */
    public Integer getShareTimes() {
        return shareTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.share_times
     *
     * @param shareTimes the value for ecs_ego_qa_question.share_times
     *
     * @mbg.generated
     */
    public void setShareTimes(Integer shareTimes) {
        this.shareTimes = shareTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.userhost
     *
     * @return the value of ecs_ego_qa_question.userhost
     *
     * @mbg.generated
     */
    public String getUserhost() {
        return userhost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.userhost
     *
     * @param userhost the value for ecs_ego_qa_question.userhost
     *
     * @mbg.generated
     */
    public void setUserhost(String userhost) {
        this.userhost = userhost == null ? null : userhost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.useragent
     *
     * @return the value of ecs_ego_qa_question.useragent
     *
     * @mbg.generated
     */
    public String getUseragent() {
        return useragent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.useragent
     *
     * @param useragent the value for ecs_ego_qa_question.useragent
     *
     * @mbg.generated
     */
    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.userloc
     *
     * @return the value of ecs_ego_qa_question.userloc
     *
     * @mbg.generated
     */
    public String getUserloc() {
        return userloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.userloc
     *
     * @param userloc the value for ecs_ego_qa_question.userloc
     *
     * @mbg.generated
     */
    public void setUserloc(String userloc) {
        this.userloc = userloc == null ? null : userloc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.deleted_at
     *
     * @return the value of ecs_ego_qa_question.deleted_at
     *
     * @mbg.generated
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.deleted_at
     *
     * @param deletedAt the value for ecs_ego_qa_question.deleted_at
     *
     * @mbg.generated
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.updated_at
     *
     * @return the value of ecs_ego_qa_question.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.updated_at
     *
     * @param updatedAt the value for ecs_ego_qa_question.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.created_at
     *
     * @return the value of ecs_ego_qa_question.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.created_at
     *
     * @param createdAt the value for ecs_ego_qa_question.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_qa_question.content
     *
     * @return the value of ecs_ego_qa_question.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_qa_question.content
     *
     * @param content the value for ecs_ego_qa_question.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}