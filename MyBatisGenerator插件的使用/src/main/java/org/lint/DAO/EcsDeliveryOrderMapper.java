package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsDeliveryOrder;

public interface EcsDeliveryOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer deliveryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_order
     *
     * @mbg.generated
     */
    int insert(EcsDeliveryOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_order
     *
     * @mbg.generated
     */
    EcsDeliveryOrder selectByPrimaryKey(Integer deliveryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_order
     *
     * @mbg.generated
     */
    List<EcsDeliveryOrder> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsDeliveryOrder record);
}