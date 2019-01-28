package com.clawhub.crm.mapper;

import com.clawhub.crm.common.IMapper;
import com.clawhub.crm.entity.CustomerApply;

import java.util.List;

public interface CustomerApplyMapper extends IMapper<CustomerApply> {

    void batchAddCustomerApply(List<CustomerApply> customerApplies);
}