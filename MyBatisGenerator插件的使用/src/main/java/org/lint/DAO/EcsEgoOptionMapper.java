package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsEgoOption;

public interface EcsEgoOptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_option
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_option
     *
     * @mbg.generated
     */
    int insert(EcsEgoOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_option
     *
     * @mbg.generated
     */
    EcsEgoOption selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_option
     *
     * @mbg.generated
     */
    List<EcsEgoOption> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_option
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoOption record);
}