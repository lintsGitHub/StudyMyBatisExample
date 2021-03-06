package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsVirtualGoodsCard;

public interface EcsVirtualGoodsCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_goods_card
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_goods_card
     *
     * @mbg.generated
     */
    int insert(EcsVirtualGoodsCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_goods_card
     *
     * @mbg.generated
     */
    EcsVirtualGoodsCard selectByPrimaryKey(Integer cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_goods_card
     *
     * @mbg.generated
     */
    List<EcsVirtualGoodsCard> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_goods_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsVirtualGoodsCard record);
}