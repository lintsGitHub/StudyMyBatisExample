package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsPayment;
import org.lint.Entity.EcsPaymentWithBLOBs;

public interface EcsPaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Byte payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int insert(EcsPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    EcsPaymentWithBLOBs selectByPrimaryKey(Byte payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    List<EcsPayment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsPayment record);
}