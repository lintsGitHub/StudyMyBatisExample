package org.lint.DAO;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lint.Entity.EcsAreaRegion;

public interface EcsAreaRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_area_region
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("shippingAreaId") Short shippingAreaId, @Param("regionId") Short regionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_area_region
     *
     * @mbg.generated
     */
    int insert(EcsAreaRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_area_region
     *
     * @mbg.generated
     */
    List<EcsAreaRegion> selectAll();
}