package com.clawhub.crm.core.constants;

/**
 * <Description> 状态类常量定义<br>
 *
 * @author LiZhiming<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018/9/8 <br>
 */
public class StatusConstant {
    /**
     * 按钮
     */
    public static final String RESOURCE_TYPE_BUTTON = "button";
    /**
     * 菜单
     */
    public static final String RESOURCE_TYPE_MENU = "menu";

    /**
     * RESULT_SUCC
     */
    public static final boolean RESULT_SUCC = true;

    /**
     * RESULT_ERROR
     */
    public static final boolean RESULT_ERROR = false;

    /**
     * 删除状态
     */
    public static final boolean DELETED = true;

    /**
     * 未删除状态
     */
    public static final boolean UN_DELETED = false;

    /**
     * 锁定状态
     */
    public static final String LOCKED = "1";

    /**
     * 未锁定状态
     */
    public static final String UN_LOCKED = "0";

    /**
     * 0:待审核
     */
    public static final String AUDIT_STATE_PENDING = "0";

    /**
     * 1:已通过
     */
    public static final String AUDIT_STATE_SUCCESS = "1";

    /**
     * 2:未通过
     */
    public static final String AUDIT_STATE_FAIL = "2";

}
