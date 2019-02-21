package com.clawhub.crm.mapper;

import com.clawhub.crm.common.IMapper;
import com.clawhub.crm.entity.CustomerAudit;

import java.util.List;

public interface CustomerAuditMapper extends IMapper<CustomerAudit> {

    void batchAddCustomerAudit(List<CustomerAudit> customerAudits);

    void update(CustomerAudit customerAudit);
}