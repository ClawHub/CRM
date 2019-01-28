package com.clawhub.crm.controller;

import com.clawhub.crm.entity.Customer;
import com.clawhub.crm.entity.CustomerAudit;
import com.clawhub.crm.entity.vo.QueryCustomerVO;
import com.clawhub.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;
import java.util.List;

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
     * @param customer the customer
     * @return the string
     */
    @PostMapping("add")
    public String add(Customer customer) {
        //校验

        //调用服务
        customerService.addCustomers(Collections.singletonList(customer));
        return "";
    }

    /**
     * Apply customer list string.
     *
     * @param queryCustomerVO the query customer vo
     * @return the string
     */
    @PostMapping("queryApplyCustomerList")
    public String queryApplyCustomerList(QueryCustomerVO queryCustomerVO) {
        List<Customer> customers = customerService.queryApplyCustomerList(queryCustomerVO);
        return "";
    }

    /**
     * Audit customer list string.
     *
     * @param queryCustomerVO the query customer vo
     * @return the string
     */
    @PostMapping("queryAuditCustomerList")
    public String queryAuditCustomerList(QueryCustomerVO queryCustomerVO) {
        List<Customer> customers = customerService.queryAuditCustomerList(queryCustomerVO);
        return "";
    }

    @PostMapping("audit")
    public String audit(CustomerAudit customerAudit) {
        //校验
        customerService.audit(customerAudit);
        return "";
    }

//    /**
//     * 先不做
//     *
//     * @return the string
//     */
//    @GetMapping("viewCustomer")
//    public String viewCustomer() {
//        customerService.viewCustomer();
//        return "";
//    }

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
