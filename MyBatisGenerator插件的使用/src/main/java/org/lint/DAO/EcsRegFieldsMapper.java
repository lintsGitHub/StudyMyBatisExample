package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsRegFields;

public interface EcsRegFieldsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_reg_fields
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_reg_fields
     *
     * @mbg.generated
     */
    int insert(EcsRegFields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_reg_fields
     *
     * @mbg.generated
     */
    EcsRegFields selectByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_reg_fields
     *
     * @mbg.generated
     */
    List<EcsRegFields> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_reg_fields
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsRegFields record);
}