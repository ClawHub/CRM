package com.clawhub.crm.controller;

import com.clawhub.crm.core.result.ResultUtil;
import com.clawhub.crm.entity.Employee;
import com.clawhub.crm.service.EmployeeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <Description> 员工信息网关<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-22 21:17<br>
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {

    /**
     * 员工信息接口.
     */
    @Autowired
    private EmployeeService employeeService;

    /**
     * 更新员工基础信息
     *
     * @param employee 员工信息
     * @return the string
     */
    @PostMapping("updateEmployee")
    public String updateEmployee(@RequestBody Employee employee) {
        //TODO token-->userInfo
        String userId = "";
        employeeService.updateEmployee(employee, userId);
        return ResultUtil.getSucc();
    }


    /**
     * 员工部门划分
     *
     * @param employeeId   员工id
     * @param departmentId 部门id
     * @return the employee department
     */
    @PostMapping("setEmployeeDepartment")
    public String setEmployeeDepartment(String employeeId, String departmentId) {
        if (StringUtils.isAnyBlank(employeeId, departmentId)) {
            return ResultUtil.getError("2001");
        }
        employeeService.setEmployeeDepartment(employeeId, departmentId);
        return ResultUtil.getSucc();
    }


}
