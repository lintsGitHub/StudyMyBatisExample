package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsWholesale;

public interface EcsWholesaleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_wholesale
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer actId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_wholesale
     *
     * @mbg.generated
     */
    int insert(EcsWholesale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_wholesale
     *
     * @mbg.generated
     */
    EcsWholesale selectByPrimaryKey(Integer actId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_wholesale
     *
     * @mbg.generated
     */
    List<EcsWholesale> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_wholesale
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWholesale record);
}