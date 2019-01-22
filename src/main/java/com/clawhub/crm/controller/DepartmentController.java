package com.clawhub.crm.controller;

import com.clawhub.crm.core.result.ResultUtil;
import com.clawhub.crm.entity.Department;
import com.clawhub.crm.entity.EmployeeDepartment;
import com.clawhub.crm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <Description>部门网关<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 14:27 <br>
 */
@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("add")
    public String add(@RequestBody Department department) {
        //判空校验
        if (null == department) {
            return ResultUtil.getError("2001");
        }
        //业务
        departmentService.add(department);
        return ResultUtil.getSucc();
    }

    @GetMapping("view")
    public String view() {
        return ResultUtil.getSucc(departmentService.view());
    }

}
