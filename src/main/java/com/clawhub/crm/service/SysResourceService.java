package com.clawhub.crm.service;

import com.clawhub.crm.entity.SysResource;

/**
 * <Description> 资源服务接口<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-21 21:23<br>
 */
public interface SysResourceService {
    /**
     * 新增菜单按钮资源
     *
     * @param sysResource 菜单按钮资源
     */
    void add(SysResource sysResource);

    /**
     * 资源查看，树形展示
     *
     * @return 资源树
     */
    String view();

}
