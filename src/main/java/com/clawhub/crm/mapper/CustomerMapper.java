package com.clawhub.crm.mapper;

import com.clawhub.crm.common.IMapper;
import com.clawhub.crm.entity.Customer;

import java.util.List;

public interface CustomerMapper extends IMapper<Customer> {
    void batchAddCustomer(List<Customer> customers);
}