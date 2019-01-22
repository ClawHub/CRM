package com.clawhub.crm.service.impl;

import com.clawhub.crm.entity.Department;
import com.clawhub.crm.mapper.DepartmentMapper;
import com.clawhub.crm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <Description>DepartmentServiceImpl<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 14:47 <br>
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public String add(Department department) {
        department.setId("");
        department.setDepartmentId("");
        departmentMapper.insert(department);
        return null;
    }

    @Override
    public String view() {
        List<Department> list = departmentMapper.selectAll();
        //list --> tree
        return null;
    }
}
