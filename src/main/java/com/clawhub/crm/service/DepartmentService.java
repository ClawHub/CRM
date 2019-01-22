package com.clawhub.crm.service;

import com.clawhub.crm.entity.Department;
import com.clawhub.crm.entity.SysResource;

/**
 * <Description>DepartmentService<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 14:31 <br>
 */
public interface DepartmentService {
    /**
     * 新增部门信息
     *
     * @param department 部门信息
     * @return 返回信息
     */
    String add(Department department);

    /**
     * 资源查看，树形展示
     *
     * @return 资源树
     */
    String view();
}
