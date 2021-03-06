package org.lint.Entity;

import java.util.Date;

public class EcsEgoFavorite {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_favorite.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_favorite.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_favorite.target_id
     *
     * @mbg.generated
     */
    private Long targetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_favorite.target_type
     *
     * @mbg.generated
     */
    private Integer targetType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_favorite.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_favorite.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_favorite.id
     *
     * @return the value of ecs_ego_favorite.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_favorite.id
     *
     * @param id the value for ecs_ego_favorite.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_favorite.user_id
     *
     * @return the value of ecs_ego_favorite.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_favorite.user_id
     *
     * @param userId the value for ecs_ego_favorite.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_favorite.target_id
     *
     * @return the value of ecs_ego_favorite.target_id
     *
     * @mbg.generated
     */
    public Long getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_favorite.target_id
     *
     * @param targetId the value for ecs_ego_favorite.target_id
     *
     * @mbg.generated
     */
    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_favorite.target_type
     *
     * @return the value of ecs_ego_favorite.target_type
     *
     * @mbg.generated
     */
    public Integer getTargetType() {
        return targetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_favorite.target_type
     *
     * @param targetType the value for ecs_ego_favorite.target_type
     *
     * @mbg.generated
     */
    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_favorite.type
     *
     * @return the value of ecs_ego_favorite.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_favorite.type
     *
     * @param type the value for ecs_ego_favorite.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_favorite.created_at
     *
     * @return the value of ecs_ego_favorite.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_favorite.created_at
     *
     * @param createdAt the value for ecs_ego_favorite.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}