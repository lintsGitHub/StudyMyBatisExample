package org.lint.DAO;

import java.util.List;
import org.lint.Entity.EcsVote;

public interface EcsVoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short voteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    int insert(EcsVote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    EcsVote selectByPrimaryKey(Short voteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    List<EcsVote> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsVote record);
}