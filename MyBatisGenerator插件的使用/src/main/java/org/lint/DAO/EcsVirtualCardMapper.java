package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsVirtualCard;

public interface EcsVirtualCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int insert(EcsVirtualCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    EcsVirtualCard selectByPrimaryKey(Integer cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    List<EcsVirtualCard> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsVirtualCard record);
}