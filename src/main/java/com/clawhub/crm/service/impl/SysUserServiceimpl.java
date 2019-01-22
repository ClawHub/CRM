package com.clawhub.crm.service.impl;

import com.clawhub.crm.entity.EmployeeDepartment;
import com.clawhub.crm.entity.SysUser;
import com.clawhub.crm.entity.UserResource;
import com.clawhub.crm.mapper.EmployeeDepartmentMapper;
import com.clawhub.crm.mapper.SysUserMapper;
import com.clawhub.crm.mapper.UserResourceMapper;
import com.clawhub.crm.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <Description>SysUserServiceimpl<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 16:56 <br>
 */
public class SysUserServiceimpl implements SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    EmployeeDepartmentMapper employeeDepartmentMapper;
    @Autowired
    UserResourceMapper userResourceMapper;

    @Override
    public int signUp(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public String signIn(String name, String password) {
        //select password where name = ?
        return null;
    }

    @Override
    public int updateUserInfo(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKey(sysUser);
    }

    @Override
    public int updateUserDepartment(EmployeeDepartment employeeDepartment) {
        return employeeDepartmentMapper.updateByPrimaryKey(employeeDepartment);
    }

    @Override
    public int updateUserResource(UserResource userResource) {
        return userResourceMapper.updateByPrimaryKey(userResource);
    }
}
