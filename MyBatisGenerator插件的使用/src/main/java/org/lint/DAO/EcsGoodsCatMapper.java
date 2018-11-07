package org.lint.DAO;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lint.Entity.EcsGoodsCat;

public interface EcsGoodsCatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_cat
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("goodsId") Integer goodsId, @Param("catId") Short catId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_cat
     *
     * @mbg.generated
     */
    int insert(EcsGoodsCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_cat
     *
     * @mbg.generated
     */
    List<EcsGoodsCat> selectAll();
}