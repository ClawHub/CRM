package com.clawhub.crm.core.constants;

/**
 * <Description>数据权限常用类
 *
 * @author DaShi<br>
 * @CreateDate 2019-03-02 19:27 <br>
 */
public class DataScopeConstant {

    /**
     * 仅本人数据 ： 查询时带入本人员工ID
     */
    public static final int ONLY_SELF = 0;


    /**
     * 查看所在部门数据：根据本人ID获取部门ID,再根据部门ID获取部门内所有员工ID,再根据所有员工ID获取客户信息.
     */
    public static final int ONLY_DEPARTMENT = 1;

    /**
     * 查看所在部门及以下数据：和2类似，增加一步，根据部门id获取子部门id
     */
    public static final int DEPARTMENT_UNDER = 2;

    /**
     * 查看所有数据，则直接获取
     */
    public static final int ALL = 3;

    /**
     * 定制数据权限，将角色关联部门，根据本人ID,获取角色ID,根据角色ID,获取部门ID列表，再获取部门下所有员工ID,再获取客户数据.
     */
    public static final int CUSTOM = 4;
}
