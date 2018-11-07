package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsAttributeColor;

public interface EcsAttributeColorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute_color
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer attrColorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute_color
     *
     * @mbg.generated
     */
    int insert(EcsAttributeColor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute_color
     *
     * @mbg.generated
     */
    EcsAttributeColor selectByPrimaryKey(Integer attrColorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute_color
     *
     * @mbg.generated
     */
    List<EcsAttributeColor> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute_color
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsAttributeColor record);
}