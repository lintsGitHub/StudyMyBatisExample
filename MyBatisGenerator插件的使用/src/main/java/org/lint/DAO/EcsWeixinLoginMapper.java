package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsWeixinLogin;

public interface EcsWeixinLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_login
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_login
     *
     * @mbg.generated
     */
    int insert(EcsWeixinLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_login
     *
     * @mbg.generated
     */
    EcsWeixinLogin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_login
     *
     * @mbg.generated
     */
    List<EcsWeixinLogin> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_login
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinLogin record);
}