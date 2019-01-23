package com.clawhub.crm.core.userpool.impl;

import com.clawhub.crm.core.userpool.SysUserNamePool;
import com.clawhub.crm.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <Description> 集合实现用户池<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-23 21:31<br>
 */
@Component("setSysUserNamePool")
public class SetSysUserNamePool implements SysUserNamePool {
    /**
     * The Pool.
     */
    private Set<String> pool = Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());

    /**
     * The Sys user service.
     */
    @Autowired
    private SysUserService sysUserService;

    /**
     * 判断用户名是否存在
     *
     * @param userName
     * @return
     */
    @Override
    public boolean isRepeatUserName(String userName) {
        return pool.contains(userName);
    }

    /**
     * 注册用户名
     *
     * @param userName 用户名
     */
    @Override
    public void register(String userName) {
        pool.add(userName);
    }

    /**
     * 注销用户名
     *
     * @param userName 用户名
     */
    @Override
    public void cancel(String userName) {
        pool.remove(userName);
    }

    /**
     * 系统启动从数据库中拉数据到内存
     */
    @Override
    public void load() {
        List<String> userNameList = sysUserService.getAllUserName();
        System.out.println(userNameList);
        if (CollectionUtils.isEmpty(userNameList)) {
            return;
        }
        pool.addAll(userNameList);
    }


}
