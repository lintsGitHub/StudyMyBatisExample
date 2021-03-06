package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsGoodsAttr;

public interface EcsGoodsAttrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_attr
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer goodsAttrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_attr
     *
     * @mbg.generated
     */
    int insert(EcsGoodsAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_attr
     *
     * @mbg.generated
     */
    EcsGoodsAttr selectByPrimaryKey(Integer goodsAttrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_attr
     *
     * @mbg.generated
     */
    List<EcsGoodsAttr> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_attr
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsGoodsAttr record);
}