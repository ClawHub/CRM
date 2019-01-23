package com.clawhub.crm.init;

import com.clawhub.crm.core.userpool.SysUserNamePool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <Description> 系统启动时使用<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-23 21:43<br>
 */
@Component
public class Starter {

    /**
     * The Sys user pool.
     */
    @Autowired
    @Qualifier("setSysUserNamePool")
    private SysUserNamePool sysUserNamePool;

    /**
     * 系统启动
     */
    @PostConstruct
    public void init() {
        //拉数据
        sysUserNamePool.load();
    }
}
