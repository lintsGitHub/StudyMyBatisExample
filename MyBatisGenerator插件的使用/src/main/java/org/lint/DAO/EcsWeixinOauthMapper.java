package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsWeixinOauth;

public interface EcsWeixinOauthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_oauth
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_oauth
     *
     * @mbg.generated
     */
    int insert(EcsWeixinOauth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_oauth
     *
     * @mbg.generated
     */
    EcsWeixinOauth selectByPrimaryKey(Integer oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_oauth
     *
     * @mbg.generated
     */
    List<EcsWeixinOauth> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_oauth
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinOauth record);
}