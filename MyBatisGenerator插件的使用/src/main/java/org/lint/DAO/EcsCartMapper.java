package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsCart;

public interface EcsCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cart
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cart
     *
     * @mbg.generated
     */
    int insert(EcsCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cart
     *
     * @mbg.generated
     */
    EcsCart selectByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cart
     *
     * @mbg.generated
     */
    List<EcsCart> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cart
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsCart record);
}