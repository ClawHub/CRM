package com.clawhub.crm.service.impl;

import com.clawhub.crm.entity.SysResource;
import com.clawhub.crm.mapper.SysResourceMapper;
import com.clawhub.crm.service.SysResourceService;
import com.clawhub.crm.util.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <Description> 资源服务接口实现<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-21 21:27<br>
 */
@Service
public class SysResourceServiceImpl implements SysResourceService {

    @Autowired
    private SysResourceMapper sysResourceMapper;

    /**
     * 新增菜单按钮资源
     *
     * @param sysResource 菜单按钮资源
     * @return 返回信息
     */
    @Override
    public void add(SysResource sysResource) {
        String id = IDGenerator.getID();
        sysResource.setId(id);
        sysResource.setResourceId("sysRe" + id);
        sysResourceMapper.insert(sysResource);
    }

    /**
     * 资源查看，树形展示
     *
     * @return 资源树
     */
    @Override
    public String view() {
        List<SysResource> list = sysResourceMapper.selectAll();
        //list --> tree
        return null;
    }
}
