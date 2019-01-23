package com.clawhub.crm.service.impl;

import com.clawhub.crm.entity.EmployeeDepartment;
import com.clawhub.crm.entity.SysUser;
import com.clawhub.crm.entity.UserResource;
import com.clawhub.crm.mapper.EmployeeDepartmentMapper;
import com.clawhub.crm.mapper.SysUserMapper;
import com.clawhub.crm.mapper.UserResourceMapper;
import com.clawhub.crm.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <Description>系统用户接口实现<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 16:56 <br>
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private EmployeeDepartmentMapper employeeDepartmentMapper;
    @Autowired
    private UserResourceMapper userResourceMapper;

    /**
     * 用户注册
     * @param sysUser
     * @return
     */
    @Override
    public String signUp(SysUser sysUser) {
        //TODO 防止重复数据
//        if () {
//            return "";
//        }
        //数据补充
//        sysUser.setId();

        //入库
        sysUserMapper.insert(sysUser);
        return "1000";
    }

    /**
     * 用户登录
     * @param name     用户名
     * @param password 登录密码
     * @return
     */
    @Override
    public String signIn(String name, String password) {
        //select password where name = ?
        return null;
    }

    /**
     * 更新用户信息
     * @param sysUser 系统用户信息
     * @return
     */
    @Override
    public int updateUserInfo(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKey(sysUser);
    }

    /**
     * 更新用户部门
     * @param employeeDepartment 员工部门关系
     * @return
     */
    @Override
    public int updateUserDepartment(EmployeeDepartment employeeDepartment) {
        return employeeDepartmentMapper.updateByPrimaryKey(employeeDepartment);
    }

    /**
     * 更新用户资源
     * @param userResource 员工资源关系
     * @return
     */
    @Override
    public int updateUserResource(UserResource userResource) {
        return userResourceMapper.updateByPrimaryKey(userResource);
    }
}
