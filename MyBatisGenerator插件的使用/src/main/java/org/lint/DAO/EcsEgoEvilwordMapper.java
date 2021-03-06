package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsEgoEvilword;

public interface EcsEgoEvilwordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_evilword
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_evilword
     *
     * @mbg.generated
     */
    int insert(EcsEgoEvilword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_evilword
     *
     * @mbg.generated
     */
    EcsEgoEvilword selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_evilword
     *
     * @mbg.generated
     */
    List<EcsEgoEvilword> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_evilword
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoEvilword record);
}