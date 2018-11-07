package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsOrderInfo;

public interface EcsOrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_info
     *
     * @mbg.generated
     */
    int insert(EcsOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_info
     *
     * @mbg.generated
     */
    EcsOrderInfo selectByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_info
     *
     * @mbg.generated
     */
    List<EcsOrderInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsOrderInfo record);
}