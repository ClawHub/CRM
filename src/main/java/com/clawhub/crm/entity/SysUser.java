package com.clawhub.crm.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zm
 */
@Table(name = "t_sys_user")
public class SysUser implements Serializable {
    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 2337357277490706892L;
    /**
     * id
     */
    private String id;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 更新人
     */
    @Column(name = "update_user")
    private String updateUser;

    /**
     * 备注
     */
    private String remark;

    /**
     * 删除状态 0:未删除 1:已删除
     */
    @Column(name = "del_flag")
    private Boolean delFlag;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 登录名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 登录密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 用户状态0:启用 1:禁用
     */
    @Column(name = "user_state")
    private Boolean userState;

    /**
     * 盐
     */
    private String salt;

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取更新人
     *
     * @return update_user - 更新人
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新人
     *
     * @param updateUser 更新人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取删除状态 0:未删除 1:已删除
     *
     * @return del_flag - 删除状态 0:未删除 1:已删除
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除状态 0:未删除 1:已删除
     *
     * @param delFlag 删除状态 0:未删除 1:已删除
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取登录名称
     *
     * @return user_name - 登录名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置登录名称
     *
     * @param userName 登录名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取登录密码
     *
     * @return user_password - 登录密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置登录密码
     *
     * @param userPassword 登录密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取用户状态0:启用 1:禁用
     *
     * @return user_state - 用户状态0:启用 1:禁用
     */
    public Boolean getUserState() {
        return userState;
    }

    /**
     * 设置用户状态0:启用 1:禁用
     *
     * @param userState 用户状态0:启用 1:禁用
     */
    public void setUserState(Boolean userState) {
        this.userState = userState;
    }

    /**
     * 获取盐
     *
     * @return salt - 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐
     *
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }
}