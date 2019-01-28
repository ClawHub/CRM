package com.clawhub.crm.service;

import com.clawhub.crm.entity.Customer;
import com.clawhub.crm.entity.CustomerAudit;
import com.clawhub.crm.entity.vo.QueryCustomerVO;

import java.util.List;

/**
 * <Description> 客户接口<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-28 21:15<br>
 */
public interface CustomerService {
    /**
     * 批量添加客户
     *
     * @param customers 客户信息
     */
    void addCustomers(List<Customer> customers);

    /**
     * 获取能看到的客户信息
     */
    void viewCustomer();

    /**
     * 查看申请创建的客户列表
     *
     * @param queryCustomerVO 查询过滤
     * @return
     */
    List<Customer> queryApplyCustomerList(QueryCustomerVO queryCustomerVO);

    /**
     * 查看审核（待，审核成功，审核失败）客户列表
     *
     * @param queryCustomerVO 查询过滤
     * @return 客户列表
     */
    List<Customer> queryAuditCustomerList(QueryCustomerVO queryCustomerVO);

    /**
     * 审核客户
     *
     * @param customerAudit 审核信息
     */
    void audit(CustomerAudit customerAudit);
}
