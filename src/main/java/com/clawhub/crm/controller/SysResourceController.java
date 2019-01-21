package com.clawhub.crm.controller;

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

    @Autowired
    private SysResourceService sysResourceService;

    @PostMapping("add")
    public String add(@RequestBody SysResource sysResource) {
        //判空校验
        //业务
        return sysResourceService.add(sysResource);
    }

    @GetMapping("view")
    public String view() {
        return sysResourceService.view();
    }
}
