package com.clawhub.crm.service.impl;

import com.clawhub.crm.core.constants.StatusConstant;
import com.clawhub.crm.entity.Customer;
import com.clawhub.crm.entity.CustomerApply;
import com.clawhub.crm.entity.CustomerAudit;
import com.clawhub.crm.entity.EmployeeCustomer;
import com.clawhub.crm.entity.bean.CustomerBean;
import com.clawhub.crm.entity.vo.QueryCustomerVO;
import com.clawhub.crm.mapper.CustomerApplyMapper;
import com.clawhub.crm.mapper.CustomerAuditMapper;
import com.clawhub.crm.mapper.CustomerMapper;
import com.clawhub.crm.mapper.EmployeeCustomerMapper;
import com.clawhub.crm.mapper.multiple.CustomerMultipleMapper;
import com.clawhub.crm.service.CustomerService;
import com.clawhub.crm.util.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
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
     * The Employee customer mapper.
     */
    @Autowired
    private EmployeeCustomerMapper employeeCustomerMapper;
    /**
     * The Customer multiple mapper.
     */
    @Autowired
    private CustomerMultipleMapper customerMultipleMapper;

    /**
     * 批量添加客户
     *
     * @param customers 客户信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addCustomers(List<Customer> customers, String applyEmployeeId, String auditEmployeeId) {
        //组装客户信息
        buildCustomers(customers);

        //批量插入
        customerMapper.batchAddCustomer(customers);

        List<CustomerApply> customerApplies = new ArrayList<>();
        List<CustomerAudit> customerAudits = new ArrayList<>();
        //申请信息
        CustomerApply customerApply;
        //审核信息
        CustomerAudit customerAudit;


        //迭代客户
        for (Customer customer : customers) {
            //申请ID
            String applyId = IDGenerator.getID();
            //组装客户申请表信息
            customerApply = new CustomerApply();
            customerApply.setApplyId(applyId);
            customerApply.setCreateTime(new Date());
            //客户ID
            customerApply.setCustomerId(customer.getCustomerId());
            customerApply.setDelete(StatusConstant.UN_DELETED);
            //申请添加客户的员工ID
            customerApply.setEmployeeId(applyEmployeeId);
            customerApply.setId(IDGenerator.getID());

            //客户审核表组装
            customerAudit = new CustomerAudit();
            customerAudit.setApplyId(applyId);
            customerAudit.setAuditId(IDGenerator.getID());
            //待审核
            customerAudit.setAuditState(StatusConstant.AUDIT_STATE_PENDING);
            customerAudit.setCreateTime(new Date());
            customerAudit.setDelete(StatusConstant.UN_DELETED);
            customerAudit.setId(IDGenerator.getID());
            customerApplies.add(customerApply);
            customerAudits.add(customerAudit);
        }
        //申请表入库
        customerApplyMapper.batchAddCustomerApply(customerApplies);
        //审核表入库
        customerAuditMapper.batchAddCustomerAudit(customerAudits);
    }

    /**
     * 组装客户信息
     *
     * @param customers the customers
     */
    private void buildCustomers(List<Customer> customers) {
        //每个客户都处理
        for (Customer customer : customers) {
            customer.setCreateTime(new Date());
            customer.setCustomerId(IDGenerator.getID());
            customer.setDelete(StatusConstant.UN_DELETED);
            customer.setId(IDGenerator.getID());
        }
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
    public List<CustomerBean> queryApplyCustomerList(QueryCustomerVO queryCustomerVO) {
        return customerMultipleMapper.queryApplyCustomerList(queryCustomerVO);
    }

    /**
     * 查看审核（待，审核成功，审核失败）客户列表
     *
     * @param queryCustomerVO 查询过滤
     * @return 客户列表
     */
    @Override
    public List<Customer> queryAuditCustomerList(QueryCustomerVO queryCustomerVO) {
        return customerMultipleMapper.queryAuditCustomerList(queryCustomerVO);
    }

    /**
     * 审核客户
     *
     * @param queryCustomerVO 审核信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void audit(QueryCustomerVO queryCustomerVO) {

        CustomerAudit customerAudit = new CustomerAudit();
        //更新客户审核表
        customerAuditMapper.update(customerAudit);

        //新增客户与员工t_employee_customer关系
        EmployeeCustomer employeeCustomer = new EmployeeCustomer();
        employeeCustomer.setId(IDGenerator.getID());
        employeeCustomer.setCustomerId("cus003");
        employeeCustomer.setEmployeeId("20190101");
        employeeCustomer.setCreateTime(new Date());
        employeeCustomer.setDelete(StatusConstant.UN_DELETED);
        employeeCustomerMapper.insertSelective(employeeCustomer);
    }
}
