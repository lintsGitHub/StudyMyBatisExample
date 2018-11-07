package org.lint.DAO;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lint.Entity.EcsSupplierShopConfig;

public interface EcsSupplierShopConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_shop_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("supplierId") Integer supplierId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_shop_config
     *
     * @mbg.generated
     */
    int insert(EcsSupplierShopConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_shop_config
     *
     * @mbg.generated
     */
    EcsSupplierShopConfig selectByPrimaryKey(@Param("id") Integer id, @Param("supplierId") Integer supplierId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_shop_config
     *
     * @mbg.generated
     */
    List<EcsSupplierShopConfig> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_shop_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSupplierShopConfig record);
}