package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsBookingGoods;

public interface EcsBookingGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int insert(EcsBookingGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    EcsBookingGoods selectByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    List<EcsBookingGoods> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsBookingGoods record);
}