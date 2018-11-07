package org.lint.Entity;

public class EcsVote {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote.vote_id
     *
     * @mbg.generated
     */
    private Short voteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote.vote_name
     *
     * @mbg.generated
     */
    private String voteName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote.start_time
     *
     * @mbg.generated
     */
    private Integer startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote.end_time
     *
     * @mbg.generated
     */
    private Integer endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote.can_multi
     *
     * @mbg.generated
     */
    private byte[] canMulti;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote.vote_count
     *
     * @mbg.generated
     */
    private Integer voteCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote.vote_id
     *
     * @return the value of ecs_vote.vote_id
     *
     * @mbg.generated
     */
    public Short getVoteId() {
        return voteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote.vote_id
     *
     * @param voteId the value for ecs_vote.vote_id
     *
     * @mbg.generated
     */
    public void setVoteId(Short voteId) {
        this.voteId = voteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote.vote_name
     *
     * @return the value of ecs_vote.vote_name
     *
     * @mbg.generated
     */
    public String getVoteName() {
        return voteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote.vote_name
     *
     * @param voteName the value for ecs_vote.vote_name
     *
     * @mbg.generated
     */
    public void setVoteName(String voteName) {
        this.voteName = voteName == null ? null : voteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote.start_time
     *
     * @return the value of ecs_vote.start_time
     *
     * @mbg.generated
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote.start_time
     *
     * @param startTime the value for ecs_vote.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote.end_time
     *
     * @return the value of ecs_vote.end_time
     *
     * @mbg.generated
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote.end_time
     *
     * @param endTime the value for ecs_vote.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote.can_multi
     *
     * @return the value of ecs_vote.can_multi
     *
     * @mbg.generated
     */
    public byte[] getCanMulti() {
        return canMulti;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote.can_multi
     *
     * @param canMulti the value for ecs_vote.can_multi
     *
     * @mbg.generated
     */
    public void setCanMulti(byte[] canMulti) {
        this.canMulti = canMulti;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote.vote_count
     *
     * @return the value of ecs_vote.vote_count
     *
     * @mbg.generated
     */
    public Integer getVoteCount() {
        return voteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote.vote_count
     *
     * @param voteCount the value for ecs_vote.vote_count
     *
     * @mbg.generated
     */
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }
}