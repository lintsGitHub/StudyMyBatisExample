package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsEgoFavorite;

public interface EcsEgoFavoriteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_favorite
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_favorite
     *
     * @mbg.generated
     */
    int insert(EcsEgoFavorite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_favorite
     *
     * @mbg.generated
     */
    EcsEgoFavorite selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_favorite
     *
     * @mbg.generated
     */
    List<EcsEgoFavorite> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_favorite
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoFavorite record);
}