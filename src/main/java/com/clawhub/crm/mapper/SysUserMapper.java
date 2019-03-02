package com.clawhub.crm.mapper;

import com.clawhub.crm.common.IMapper;
import com.clawhub.crm.entity.SysUser;

import java.util.List;

/**
 * The interface Sys user mapper.
 */
public interface SysUserMapper extends IMapper<SysUser> {
    /**
     * 获取所有的的用户名
     *
     * @return the all user name
     */
    List<String> getAllUserName();

    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    SysUser QuerySysUserByUsername(String username);
}
