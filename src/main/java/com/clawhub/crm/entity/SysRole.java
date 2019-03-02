package com.clawhub.crm.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_role")
public class SysRole {
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
     * 角色id
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 0-未锁定,1-已锁定
     */
    @Column(name = "role_state")
    private Boolean roleState;

    /**
     * 描述
     */
    private String description;

    /**
     * 数据范围：0.仅本人数据，1.所在部门数据，2.所在部门及以下数据，3,所有数据，4,定制数据
     */
    @Column(name = "data_scope")
    private String dataScope;

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
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取0-未锁定,1-已锁定
     *
     * @return role_state - 0-未锁定,1-已锁定
     */
    public Boolean getRoleState() {
        return roleState;
    }

    /**
     * 设置0-未锁定,1-已锁定
     *
     * @param roleState 0-未锁定,1-已锁定
     */
    public void setRoleState(Boolean roleState) {
        this.roleState = roleState;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取数据范围：0.仅本人数据，1.所在部门数据，2.所在部门及以下数据，3,所有数据，4,定制数据
     *
     * @return data_scope - 数据范围：0.仅本人数据，1.所在部门数据，2.所在部门及以下数据，3,所有数据，4,定制数据
     */
    public String getDataScope() {
        return dataScope;
    }

    /**
     * 设置数据范围：0.仅本人数据，1.所在部门数据，2.所在部门及以下数据，3,所有数据，4,定制数据
     *
     * @param dataScope 数据范围：0.仅本人数据，1.所在部门数据，2.所在部门及以下数据，3,所有数据，4,定制数据
     */
    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }
}