package com.clawhub.crm.service.impl;

import com.clawhub.crm.entity.Department;
import com.clawhub.crm.mapper.DepartmentMapper;
import com.clawhub.crm.service.DepartmentService;
import com.clawhub.crm.util.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <Description>部门信息接口实现<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 14:47 <br>
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * @param department 部门信息
     * @return
     */
    @Override
    public String add(Department department) {
        String id = IDGenerator.getID();
        department.setId(id);
        department.setDepartmentId("DEP" + id);
        departmentMapper.insert(department);
        return null;
    }

    /**
     * 资源查看，树形展示
     * @return 部门树形图
     */
    @Override
    public String view() {
        List<Department> list = departmentMapper.selectAll();
        //list --> tree
        return null;
    }
}
