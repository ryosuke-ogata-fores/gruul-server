package jp.fores.gruul.db.entity;

import java.util.Date;

public class IUserGroup {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_group.id
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_group.group_uuid
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    private String groupUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_group.user_uuid
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    private String userUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_group.joined
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    private Boolean joined;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_group.removed
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    private Boolean removed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_group.arrived
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    private Boolean arrived;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_group.comment
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_group.deleted_at
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    private Date deletedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_group.created_at
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_group.updated_at
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_user_group
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public IUserGroup(Integer id, String groupUuid, String userUuid, Boolean joined, Boolean removed, Boolean arrived, String comment, Date deletedAt, Date createdAt, Date updatedAt) {
        this.id = id;
        this.groupUuid = groupUuid;
        this.userUuid = userUuid;
        this.joined = joined;
        this.removed = removed;
        this.arrived = arrived;
        this.comment = comment;
        this.deletedAt = deletedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_group.id
     *
     * @return the value of i_user_group.id
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_group.group_uuid
     *
     * @return the value of i_user_group.group_uuid
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public String getGroupUuid() {
        return groupUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_group.user_uuid
     *
     * @return the value of i_user_group.user_uuid
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public String getUserUuid() {
        return userUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_group.joined
     *
     * @return the value of i_user_group.joined
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public Boolean getJoined() {
        return joined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_group.removed
     *
     * @return the value of i_user_group.removed
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public Boolean getRemoved() {
        return removed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_group.arrived
     *
     * @return the value of i_user_group.arrived
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public Boolean getArrived() {
        return arrived;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_group.comment
     *
     * @return the value of i_user_group.comment
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_group.deleted_at
     *
     * @return the value of i_user_group.deleted_at
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_group.created_at
     *
     * @return the value of i_user_group.created_at
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_group.updated_at
     *
     * @return the value of i_user_group.updated_at
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }
}