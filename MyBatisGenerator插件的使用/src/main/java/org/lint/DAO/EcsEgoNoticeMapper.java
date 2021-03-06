package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsEgoNotice;

public interface EcsEgoNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_notice
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_notice
     *
     * @mbg.generated
     */
    int insert(EcsEgoNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_notice
     *
     * @mbg.generated
     */
    EcsEgoNotice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_notice
     *
     * @mbg.generated
     */
    List<EcsEgoNotice> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_notice
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoNotice record);
}