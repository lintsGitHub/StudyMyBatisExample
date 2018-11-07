package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsSupplierMoneyLog;

public interface EcsSupplierMoneyLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int insert(EcsSupplierMoneyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    EcsSupplierMoneyLog selectByPrimaryKey(Integer logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    List<EcsSupplierMoneyLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSupplierMoneyLog record);
}