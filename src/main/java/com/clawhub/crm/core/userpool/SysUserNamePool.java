package com.clawhub.crm.core.userpool;

/**
 * <Description> 用户池<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-23 21:27<br>
 */
public interface SysUserNamePool {
    /**
     * 判断用户名是否存在
     *
     * @param userName 用户名
     * @return
     */
    boolean isRepeatUserName(String userName);

    /**
     * 注册用户名
     *
     * @param userName 用户名
     */
    void register(String userName);

    /**
     * 注销用户名
     *
     * @param userName 用户名
     */
    void cancel(String userName);

    /**
     * 系统启动从数据库中拉数据到内存
     */
    void load();
}
