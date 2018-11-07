package org.lint.DAO;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lint.Entity.EcsVolumePrice;

public interface EcsVolumePriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_volume_price
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("priceType") byte[] priceType, @Param("goodsId") Integer goodsId, @Param("volumeNumber") Short volumeNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_volume_price
     *
     * @mbg.generated
     */
    int insert(EcsVolumePrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_volume_price
     *
     * @mbg.generated
     */
    EcsVolumePrice selectByPrimaryKey(@Param("priceType") byte[] priceType, @Param("goodsId") Integer goodsId, @Param("volumeNumber") Short volumeNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_volume_price
     *
     * @mbg.generated
     */
    List<EcsVolumePrice> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_volume_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsVolumePrice record);
}