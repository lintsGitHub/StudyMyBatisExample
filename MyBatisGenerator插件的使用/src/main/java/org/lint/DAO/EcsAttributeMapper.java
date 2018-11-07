package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsAttribute;

public interface EcsAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short attrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int insert(EcsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    EcsAttribute selectByPrimaryKey(Short attrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    List<EcsAttribute> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsAttribute record);
}