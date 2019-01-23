package com.clawhub.crm.service;

import com.clawhub.crm.entity.EmployeeDepartment;
import com.clawhub.crm.entity.SysUser;
import com.clawhub.crm.entity.UserResource;

/**
 * <Description>系统用户接口<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 15:56 <br>
 */
public interface SysUserService {


    /**
     * 用户注册
     *
     * @param sysuser 系统用户信息
     * @return
     */
    String signUp(SysUser sysuser);


    /**
     * 登录
     *
     * @param name 用户名
     * @return
     */
    String signIn(String name, String password);


    /**
     * 更新员工信息
     *
     * @param sysUser 系统用户信息
     * @return
     */
    int updateUserInfo(SysUser sysUser);


    /**
     * 更新员工部门
     *
     * @param employeeDepartment 员工部门关系
     * @return
     */
    int updateUserDepartment(EmployeeDepartment employeeDepartment);


    /**
     * 划分员工资源
     *
     * @param userResource  员工资源关系
     * @return
     */
    int updateUserResource(UserResource userResource);
}
