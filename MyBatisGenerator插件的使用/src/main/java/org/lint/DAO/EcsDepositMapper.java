package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsDeposit;

public interface EcsDepositMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_deposit
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_deposit
     *
     * @mbg.generated
     */
    int insert(EcsDeposit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_deposit
     *
     * @mbg.generated
     */
    EcsDeposit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_deposit
     *
     * @mbg.generated
     */
    List<EcsDeposit> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_deposit
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsDeposit record);
}