package com.clawhub.crm.service;

import com.clawhub.crm.entity.EmployeeDepartment;
import com.clawhub.crm.entity.SysUser;
import com.clawhub.crm.entity.UserResource;

/**
 * <Description>SysUserService<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 15:56 <br>
 */
public interface SysUserService {


    /**
     * 用户注册
     *
     * @param sysuser
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
     * @param sysUser
     * @return
     */
    int updateUserInfo(SysUser sysUser);


    /**
     * 更新员工部门
     *
     * @param employeeDepartment
     * @return
     */
    int updateUserDepartment(EmployeeDepartment employeeDepartment);


    /**
     * 划分员工资源
     *
     * @param userResource
     * @return
     */
    int updateUserResource(UserResource userResource);
}
