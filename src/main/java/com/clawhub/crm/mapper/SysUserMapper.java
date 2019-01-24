package com.clawhub.crm.mapper;

import com.clawhub.crm.common.IMapper;

import java.util.List;

/**
 * The interface Sys user mapper.
 */
public interface SysUserMapper extends IMapper<SysUser> {
    /**
     * Gets all user name.
     *
     * @return the all user name
     */
    List<String> getAllUserName();

}