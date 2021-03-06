package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsErrorLog;

public interface EcsErrorLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_error_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_error_log
     *
     * @mbg.generated
     */
    int insert(EcsErrorLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_error_log
     *
     * @mbg.generated
     */
    EcsErrorLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_error_log
     *
     * @mbg.generated
     */
    List<EcsErrorLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_error_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsErrorLog record);
}