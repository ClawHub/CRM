package com.clawhub.crm.service.impl;

import com.clawhub.crm.service.SysRoleService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * <Description> 角色<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-03-02 21:47<br>
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    /**
     * 根据用户ID获取角色名称列表
     *
     * @param userId 用户ID
     * @return 角色名称列表角色名称列表
     */
    @Override
    public Set<String> findRoleNamesByUserId(String userId) {
        return null;
    }
}
