package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsVirtualGoodsDistrict;

public interface EcsVirtualGoodsDistrictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_goods_district
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short districtId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_goods_district
     *
     * @mbg.generated
     */
    int insert(EcsVirtualGoodsDistrict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_goods_district
     *
     * @mbg.generated
     */
    EcsVirtualGoodsDistrict selectByPrimaryKey(Short districtId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_goods_district
     *
     * @mbg.generated
     */
    List<EcsVirtualGoodsDistrict> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_goods_district
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsVirtualGoodsDistrict record);
}