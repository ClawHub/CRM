package com.clawhub.crm.mapper.multiple;

import com.clawhub.crm.entity.bean.CustomerBean;
import com.clawhub.crm.entity.vo.QueryCustomerVO;

import java.util.List;

/**
 * <Description> 客户组合<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-02-20 22:04<br>
 */
public interface CustomerMultipleMapper {

    /**
     * 查看申请的客户信息
     *
     * @param queryCustomerVO 查询条件
     * @return 申请的客户信息
     */
    List<CustomerBean> query(QueryCustomerVO queryCustomerVO);
}
