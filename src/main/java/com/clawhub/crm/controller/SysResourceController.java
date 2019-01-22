package com.clawhub.crm.controller;

import com.clawhub.crm.core.result.ResultUtil;
import com.clawhub.crm.entity.SysResource;
import com.clawhub.crm.service.SysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <Description> 资源网关<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-21 21:18<br>
 */
@RestController
@RequestMapping("sysResource")
public class SysResourceController {

    /**
     * 系统资源服务接口
     */
    @Autowired
    private SysResourceService sysResourceService;

    /**
     * 新增资源
     *
     * @param sysResource 资源信息
     * @return the string
     */
    @PostMapping("add")
    public String add(@RequestBody SysResource sysResource) {
        //判空校验
        if (null == sysResource) {
            return ResultUtil.getError("2001");
        }
        sysResourceService.add(sysResource);
        return ResultUtil.getSucc();
    }

    /**
     * 查看资源树
     *
     * @return 资源树
     */
    @GetMapping("view")
    public String view() {
        return ResultUtil.getSucc(sysResourceService.view());
    }
}
