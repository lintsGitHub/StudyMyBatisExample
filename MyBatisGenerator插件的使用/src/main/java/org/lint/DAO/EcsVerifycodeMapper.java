package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsVerifycode;

public interface EcsVerifycodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int insert(EcsVerifycode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    EcsVerifycode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    List<EcsVerifycode> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsVerifycode record);
}