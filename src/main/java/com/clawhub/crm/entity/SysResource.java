package com.clawhub.crm.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_resource")
public class SysResource {
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
     * 资源ID
     */
    @Column(name = "resource_id")
    private String resourceId;

    /**
     * 资源名称
     */
    @Column(name = "resource_name")
    private String resourceName;

    /**
     * 资源状态  0:启用，1:禁用
     */
    @Column(name = "resource_state")
    private Boolean resourceState;

    /**
     * 资源类型 0:url,1:button
     */
    @Column(name = "resource_type")
    private Boolean resourceType;

    /**
     * 权限标识
     */
    @Column(name = "auth_mark")
    private String authMark;

    /**
     * 父资源ID
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 资源URL
     */
    private String url;

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }

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
     * 获取资源ID
     *
     * @return resource_id - 资源ID
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 设置资源ID
     *
     * @param resourceId 资源ID
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 获取资源名称
     *
     * @return resource_name - 资源名称
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置资源名称
     *
     * @param resourceName 资源名称
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * 获取资源状态  0:启用，1:禁用
     *
     * @return resource_state - 资源状态  0:启用，1:禁用
     */
    public Boolean getResourceState() {
        return resourceState;
    }

    /**
     * 设置资源状态  0:启用，1:禁用
     *
     * @param resourceState 资源状态  0:启用，1:禁用
     */
    public void setResourceState(Boolean resourceState) {
        this.resourceState = resourceState;
    }

    /**
     * 获取资源类型 0:url,1:button
     *
     * @return resource_type - 资源类型 0:url,1:button
     */
    public Boolean getResourceType() {
        return resourceType;
    }

    /**
     * 设置资源类型 0:url,1:button
     *
     * @param resourceType 资源类型 0:url,1:button
     */
    public void setResourceType(Boolean resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * 获取权限标识
     *
     * @return auth_mark - 权限标识
     */
    public String getAuthMark() {
        return authMark;
    }

    /**
     * 设置权限标识
     *
     * @param authMark 权限标识
     */
    public void setAuthMark(String authMark) {
        this.authMark = authMark;
    }

    /**
     * 获取父资源ID
     *
     * @return parent_id - 父资源ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父资源ID
     *
     * @param parentId 父资源ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}