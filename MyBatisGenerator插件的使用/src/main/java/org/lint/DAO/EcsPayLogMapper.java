package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsPayLog;

public interface EcsPayLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int insert(EcsPayLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    EcsPayLog selectByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    List<EcsPayLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsPayLog record);
}