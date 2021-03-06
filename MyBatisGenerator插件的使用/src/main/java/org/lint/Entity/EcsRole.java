package org.lint.Entity;

public class EcsRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_role.role_id
     *
     * @mbg.generated
     */
    private Short roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_role.role_name
     *
     * @mbg.generated
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_role.action_list
     *
     * @mbg.generated
     */
    private String actionList;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_role.role_describe
     *
     * @mbg.generated
     */
    private String roleDescribe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_role.role_id
     *
     * @return the value of ecs_role.role_id
     *
     * @mbg.generated
     */
    public Short getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_role.role_id
     *
     * @param roleId the value for ecs_role.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_role.role_name
     *
     * @return the value of ecs_role.role_name
     *
     * @mbg.generated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_role.role_name
     *
     * @param roleName the value for ecs_role.role_name
     *
     * @mbg.generated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_role.action_list
     *
     * @return the value of ecs_role.action_list
     *
     * @mbg.generated
     */
    public String getActionList() {
        return actionList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_role.action_list
     *
     * @param actionList the value for ecs_role.action_list
     *
     * @mbg.generated
     */
    public void setActionList(String actionList) {
        this.actionList = actionList == null ? null : actionList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_role.role_describe
     *
     * @return the value of ecs_role.role_describe
     *
     * @mbg.generated
     */
    public String getRoleDescribe() {
        return roleDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_role.role_describe
     *
     * @param roleDescribe the value for ecs_role.role_describe
     *
     * @mbg.generated
     */
    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe == null ? null : roleDescribe.trim();
    }
}