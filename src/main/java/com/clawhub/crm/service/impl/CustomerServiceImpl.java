package com.clawhub.crm.service.impl;

import com.clawhub.crm.entity.Customer;
import com.clawhub.crm.entity.CustomerApply;
import com.clawhub.crm.entity.CustomerAudit;
import com.clawhub.crm.entity.vo.QueryCustomerVO;
import com.clawhub.crm.mapper.CustomerApplyMapper;
import com.clawhub.crm.mapper.CustomerAuditMapper;
import com.clawhub.crm.mapper.CustomerMapper;
import com.clawhub.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> 客户接口实现<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-28 21:51<br>
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    /**
     * The Customer mapper.
     */
    @Autowired
    private CustomerMapper customerMapper;
    /**
     * The Customer apply mapper.
     */
    @Autowired
    private CustomerApplyMapper customerApplyMapper;

    /**
     * The Customer audit mapper.
     */
    @Autowired
    private CustomerAuditMapper customerAuditMapper;

    /**
     * 批量添加客户
     *
     * @param customers 客户信息
     */
    @Override
    @Transactional
    public void addCustomers(List<Customer> customers) {
        //批量插入
        customerMapper.batchAddCustomer(customers);

        //申请表入库
        List<CustomerApply> customerApplies = new ArrayList<>();
        customerApplyMapper.batchAddCustomerApply(customerApplies);

        //审核表入库
        List<CustomerAudit> customerAudits = new ArrayList<>();
        customerAuditMapper.batchAddCustomerAudit(customerAudits);
    }

    /**
     * 获取能看到的客户信息
     */
    @Override
    public void viewCustomer() {
        //TODO
    }

    /**
     * 查看申请创建的客户列表
     *
     * @param queryCustomerVO 查询过滤
     * @return
     */
    @Override
    public List<Customer> queryApplyCustomerList(QueryCustomerVO queryCustomerVO) {

        return null;
    }

    /**
     * 查看审核（待，审核成功，审核失败）客户列表
     *
     * @param queryCustomerVO 查询过滤
     * @return 客户列表
     */
    @Override
    public List<Customer> queryAuditCustomerList(QueryCustomerVO queryCustomerVO) {
        return null;
    }

    /**
     * 审核客户
     *
     * @param customerAudit 审核信息
     */
    @Override
    public void audit(CustomerAudit customerAudit) {
        customerAuditMapper.audit(customerAudit);
    }
}
