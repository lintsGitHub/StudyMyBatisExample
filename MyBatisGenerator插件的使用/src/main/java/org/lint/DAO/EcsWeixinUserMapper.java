package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsWeixinUser;

public interface EcsWeixinUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_user
     *
     * @mbg.generated
     */
    int insert(EcsWeixinUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_user
     *
     * @mbg.generated
     */
    EcsWeixinUser selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_user
     *
     * @mbg.generated
     */
    List<EcsWeixinUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinUser record);
}