package com.clawhub.crm.controller;

import com.clawhub.crm.core.result.ResultUtil;
import com.clawhub.crm.entity.Customer;
import com.clawhub.crm.entity.vo.QueryCustomerVO;
import com.clawhub.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;

/**
 * <Description> 客户网关<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-28 21:10<br>
 */
@RestController
@RequestMapping("customer")
public class CustomerController {

    /**
     * The Customer service.
     */
    @Autowired
    private CustomerService customerService;

    /**
     * Add string.
     *
     * @param customer        the customer
     * @param applyEmployeeId the apply employee id
     * @param auditEmployeeId the audit employee id
     * @return the string
     */
    @PostMapping("add")
    public String add(Customer customer, String applyEmployeeId, String auditEmployeeId) {
        //校验
        if (customer != null) {
            return "";
        }
        //调用服务
        customerService.addCustomers(Collections.singletonList(customer), applyEmployeeId, auditEmployeeId);
        return "";
    }

    /**
     * 查看申请添加的客户列表
     * 业务员调用
     *
     * @param queryCustomerVO the query customer vo
     * @return the string
     */
    @PostMapping("queryApplyCustomerList")
    public String queryApplyCustomerList(QueryCustomerVO queryCustomerVO) {
        return ResultUtil.getSucc(customerService.queryApplyCustomerList(queryCustomerVO));
    }

    /**
     * 查看审核客户
     *
     * @param queryCustomerVO the query customer vo
     * @return the string
     */
    @PostMapping("queryAuditCustomerList")
    public String queryAuditCustomerList(QueryCustomerVO queryCustomerVO) {
        return ResultUtil.getSucc(customerService.queryAuditCustomerList(queryCustomerVO));
    }

    /**
     * 审核
     *
     * @param queryCustomerVO the customer audit
     * @return the string
     */
    @PostMapping("audit")
    public String audit(QueryCustomerVO queryCustomerVO) {
        //校验
        customerService.audit(queryCustomerVO);
        return ResultUtil.getSucc();
    }

    /**
     * 根据数据权限，获取客户信息
     * @param queryCustomerVO the customer audit
     * @return the string
     */
    @PostMapping("viewCustomer")
    public String viewCustomer(QueryCustomerVO queryCustomerVO) {
        customerService.viewCustomer(queryCustomerVO);
        return "";
    }

    /**
     * Batch add string.
     *
     * @param files the files
     * @return the string
     */
    @PostMapping("batchAdd")
    public String batchAdd(MultipartFile[] files) {
        //校验

//        for (MultipartFile file : files) {
//            InputStream inputStream = file.getInputStream();
        //读取excle
//            List<Customer> customers = ExcelBox.read(inputStream);
        //判空
        //调用服务
//            customerService.addCustomers(customers);
//        }
        return "";
    }
}
