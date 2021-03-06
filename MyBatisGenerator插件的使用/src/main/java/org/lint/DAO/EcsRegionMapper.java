package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsRegion;

public interface EcsRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_region
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short regionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_region
     *
     * @mbg.generated
     */
    int insert(EcsRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_region
     *
     * @mbg.generated
     */
    EcsRegion selectByPrimaryKey(Short regionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_region
     *
     * @mbg.generated
     */
    List<EcsRegion> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsRegion record);
}