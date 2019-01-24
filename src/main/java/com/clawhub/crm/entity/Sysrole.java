package com.clawhub.crm.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_role")
public class Sysrole {
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
    private String deletestate;

    /**
     * 用户id
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 资源id
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 0-未锁定,1-已锁定
     */
    private String 角色状态;

    private String description;

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
     * @return deletestate - 删除状态 0:未删除 1:已删除
     */
    public String getDeletestate() {
        return deletestate;
    }

    /**
     * 设置删除状态 0:未删除 1:已删除
     *
     * @param deletestate 删除状态 0:未删除 1:已删除
     */
    public void setDeletestate(String deletestate) {
        this.deletestate = deletestate;
    }

    /**
     * 获取用户id
     *
     * @return role_id - 用户id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置用户id
     *
     * @param roleId 用户id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取资源id
     *
     * @return role_name - 资源id
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置资源id
     *
     * @param roleName 资源id
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取0-未锁定,1-已锁定
     *
     * @return 角色状态 - 0-未锁定,1-已锁定
     */
    public String get角色状态() {
        return 角色状态;
    }

    /**
     * 设置0-未锁定,1-已锁定
     *
     * @param 角色状态 0-未锁定,1-已锁定
     */
    public void set角色状态(String 角色状态) {
        this.角色状态 = 角色状态;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}