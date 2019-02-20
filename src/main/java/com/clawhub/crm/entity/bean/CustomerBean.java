package com.clawhub.crm.entity.bean;

import com.clawhub.crm.entity.Customer;
import com.clawhub.crm.entity.CustomerAudit;

/**
 * <Description> 客户信息<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019 -02-20 21:55<br>
 */
public class CustomerBean {
    /**
     * The Customer.
     */
    private Customer customer;
    /**
     * The Customer audit.
     */
    private CustomerAudit customerAudit;
    /**
     * The Audit employee name.
     */
    private String auditEmployeeName;

    /**
     * Instantiates a new Customer vo.
     *
     * @param customer          the customer
     * @param customerAudit     the customer audit
     * @param auditEmployeeName the audit employee name
     */
    public CustomerBean(Customer customer, CustomerAudit customerAudit, String auditEmployeeName) {
        this.customer = customer;
        this.customerAudit = customerAudit;
        auditEmployeeName = auditEmployeeName;
    }

    /**
     * Gets customer.
     *
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets customer.
     *
     * @param customer the customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Gets customer audit.
     *
     * @return the customer audit
     */
    public CustomerAudit getCustomerAudit() {
        return customerAudit;
    }

    /**
     * Sets customer audit.
     *
     * @param customerAudit the customer audit
     */
    public void setCustomerAudit(CustomerAudit customerAudit) {
        this.customerAudit = customerAudit;
    }

    /**
     * Gets audit employee name.
     *
     * @return the audit employee name
     */
    public String getAuditEmployeeName() {
        return auditEmployeeName;
    }

    /**
     * Sets audit employee name.
     *
     * @param auditEmployeeName the audit employee name
     */
    public void setAuditEmployeeName(String auditEmployeeName) {
        this.auditEmployeeName = auditEmployeeName;
    }
}
