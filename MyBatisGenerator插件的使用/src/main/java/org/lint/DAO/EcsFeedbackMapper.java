package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsFeedback;

public interface EcsFeedbackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_feedback
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer msgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_feedback
     *
     * @mbg.generated
     */
    int insert(EcsFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_feedback
     *
     * @mbg.generated
     */
    EcsFeedback selectByPrimaryKey(Integer msgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_feedback
     *
     * @mbg.generated
     */
    List<EcsFeedback> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsFeedback record);
}