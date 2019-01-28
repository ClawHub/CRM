package com.clawhub.crm.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_customer_audit")
public class CustomerAudit {
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
    private Boolean delete;

    /**
     * 审核id
     */
    @Column(name = "audit_id")
    private String auditId;

    /**
     * 申请id
     */
    @Column(name = "apply_id")
    private String applyId;

    /**
     * 审核状态 0:待审核 1:已通过 2:未通过
     */
    @Column(name = "audit_state")
    private String auditState;

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
     * @return delete - 删除状态 0:未删除 1:已删除
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * 设置删除状态 0:未删除 1:已删除
     *
     * @param delete 删除状态 0:未删除 1:已删除
     */
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    /**
     * 获取审核id
     *
     * @return audit_id - 审核id
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * 设置审核id
     *
     * @param auditId 审核id
     */
    public void setAuditId(String auditId) {
        this.auditId = auditId;
    }

    /**
     * 获取申请id
     *
     * @return apply_id - 申请id
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 设置申请id
     *
     * @param applyId 申请id
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    /**
     * 获取审核状态 0:待审核 1:已通过 2:未通过
     *
     * @return audit_state - 审核状态 0:待审核 1:已通过 2:未通过
     */
    public String getAuditState() {
        return auditState;
    }

    /**
     * 设置审核状态 0:待审核 1:已通过 2:未通过
     *
     * @param auditState 审核状态 0:待审核 1:已通过 2:未通过
     */
    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }
}