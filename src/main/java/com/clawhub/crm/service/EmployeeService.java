package com.clawhub.crm.service;

import com.clawhub.crm.entity.Employee;

/**
 * <Description> 员工服务接口<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-22 21:22<br>
 */
public interface EmployeeService {
    /**
     * 更新员工信息
     *
     * @param employee 员工基础信息
     * @param userId   用户ID
     */
    void updateEmployee(Employee employee, String userId);

    /**
     * 设置员工部门
     *
     * @param employeeId   员工ID
     * @param departmentId 部门ID
     */
    void setEmployeeDepartment(String employeeId, String departmentId);
}
