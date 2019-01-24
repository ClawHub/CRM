package com.clawhub.crm.service;

import java.util.Set;

/**
 * <Description> 系统角色服务接口<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-24 21:22<br>
 */
public interface SysRoleService {
    /**
     * 根据用户ID获取角色名称列表
     *
     * @param userId 用户ID
     * @return 角色名称列表角色名称列表
     */
    Set<String> findRoleNamesByUserId(String userId);
}
