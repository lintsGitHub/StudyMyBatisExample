package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsUserFeed;

public interface EcsUserFeedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_feed
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer feedId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_feed
     *
     * @mbg.generated
     */
    int insert(EcsUserFeed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_feed
     *
     * @mbg.generated
     */
    EcsUserFeed selectByPrimaryKey(Integer feedId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_feed
     *
     * @mbg.generated
     */
    List<EcsUserFeed> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_feed
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsUserFeed record);
}