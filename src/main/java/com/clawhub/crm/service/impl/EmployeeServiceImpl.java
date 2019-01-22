package com.clawhub.crm.service.impl;

import com.clawhub.crm.entity.Employee;
import com.clawhub.crm.entity.EmployeeDepartment;
import com.clawhub.crm.mapper.EmployeeDepartmentMapper;
import com.clawhub.crm.mapper.EmployeeMapper;
import com.clawhub.crm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <Description> 员工服务接口实现<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-22 21:23<br>
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    /**
     * The Employee mapper.
     */
    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * The Employee department mapper.
     */
    @Autowired
    private EmployeeDepartmentMapper employeeDepartmentMapper;

    /**
     * 更新员工信息
     *
     * @param employee the employee
     * @param userId   用户ID
     */
    @Override
    public void updateEmployee(Employee employee, String userId) {
        //设置用户ID
        employee.setUserId(userId);
        //在员工表中插入数据
        employeeMapper.insert(employee);

    }

    /**
     * 设置员工部门
     *
     * @param employeeId   员工ID
     * @param departmentId 部门ID
     */
    @Override
    public void setEmployeeDepartment(String employeeId, String departmentId) {
        EmployeeDepartment record = new EmployeeDepartment();
        record.setDepartmentId(departmentId);
        record.setEmployeeId(employeeId);
        employeeDepartmentMapper.insert(record);

    }
}
