package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsPickupPoint;

public interface EcsPickupPointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pickup_point
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pickup_point
     *
     * @mbg.generated
     */
    int insert(EcsPickupPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pickup_point
     *
     * @mbg.generated
     */
    EcsPickupPoint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pickup_point
     *
     * @mbg.generated
     */
    List<EcsPickupPoint> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pickup_point
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsPickupPoint record);
}