package com.clawhub.crm.core.userpool.impl;

import com.clawhub.crm.core.userpool.SysUserNamePool;
import org.springframework.stereotype.Component;

/**
 * <Description> redis实现用户名池<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-23 22:01<br>
 */
@Component("redisSysUserNamePool")
public class RedisSysUserNamePool implements SysUserNamePool {
    /**
     * 判断用户名是否存在
     *
     * @param userName 用户名
     * @return
     */
    @Override
    public boolean isRepeatUserName(String userName) {
        return false;
    }

    /**
     * 注册用户名
     *
     * @param userName 用户名
     */
    @Override
    public void register(String userName) {

    }

    /**
     * 注销用户名
     *
     * @param userName 用户名
     */
    @Override
    public void cancel(String userName) {

    }

    /**
     * 系统启动从数据库中拉数据到内存
     */
    @Override
    public void load() {

    }
}
