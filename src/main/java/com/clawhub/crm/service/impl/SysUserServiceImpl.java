package com.clawhub.crm.service.impl;

import com.clawhub.crm.core.userpool.SysUserNamePool;
import com.clawhub.crm.entity.EmployeeDepartment;
import com.clawhub.crm.entity.SysUser;
import com.clawhub.crm.mapper.EmployeeDepartmentMapper;
import com.clawhub.crm.mapper.SysUserMapper;
import com.clawhub.crm.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <Description>系统用户接口实现<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 16:56 <br>
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    /**
     * The Sys user mapper.
     */
    @Autowired
    private SysUserMapper sysUserMapper;
    /**
     * The Employee department mapper.
     */
    @Autowired
    private EmployeeDepartmentMapper employeeDepartmentMapper;
    /**
     * The User resource mapper.
     */
    @Autowired
    private UserResourceMapper userResourceMapper;
    /**
     * The Sys user userpool.
     */
    @Autowired
    @Qualifier("setSysUserNamePool")
    private SysUserNamePool sysUserNamePool;

    /**
     * 用户注册
     *
     * @param sysUser 用户信息
     * @return 结果
     */
    @Override
    @Transactional
    public String signUp(SysUser sysUser) {
        //判断用户名是否存在
        if (sysUserNamePool.isRepeatUserName(sysUser.getUserName())) {
            return "3001";
        }
        //数据补充
//        sysUser.setId();
        // 用户名入用户池
        sysUserNamePool.register(sysUser.getUserName());
        try {
            //入库
            sysUserMapper.insert(sysUser);
        } catch (Exception e) {
            //移除
            sysUserNamePool.cancel(sysUser.getUserName());
        }
        return "1000";
    }

    /**
     * 用户登录
     *
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
     *
     * @param sysUser 系统用户信息
     * @return
     */
    @Override
    public int updateUserInfo(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKey(sysUser);
    }

    /**
     * 更新用户部门
     *
     * @param employeeDepartment 员工部门关系
     * @return
     */
    @Override
    public int updateUserDepartment(EmployeeDepartment employeeDepartment) {
        return employeeDepartmentMapper.updateByPrimaryKey(employeeDepartment);
    }

    /**
     * 更新用户资源
     *
     * @param userResource 员工资源关系
     * @return
     */
    @Override
    public int updateUserResource(UserResource userResource) {
        return userResourceMapper.updateByPrimaryKey(userResource);
    }

    /**
     * 获取所有用户名
     *
     * @return 所有用户名
     */
    @Override
    public List<String> getAllUserName() {
        return sysUserMapper.getAllUserName();
    }
}
