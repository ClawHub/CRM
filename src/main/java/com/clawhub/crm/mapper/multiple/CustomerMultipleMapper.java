package com.clawhub.crm.mapper.multiple;

import com.clawhub.crm.entity.Customer;
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
    List<CustomerBean> queryApplyCustomerList(QueryCustomerVO queryCustomerVO);

    /**
     * 查看审核的客户信息
     * @param queryCustomerVO 查询条件
     * @return 审核的客户信息
     */
    List<Customer> queryAuditCustomerList(QueryCustomerVO queryCustomerVO);

    /**
     * 只查询本人客户
     * @param queryCustomerVO
     * @return
     */
    List<Customer> queryOnlySelfCustomerList(QueryCustomerVO queryCustomerVO);

    /**
     * 只查询本部门客户
     * @param queryCustomerVO
     * @return
     */
    List<Customer> queryOnlyDepartmentCustomerList(QueryCustomerVO queryCustomerVO);

    /**
     * 查询部门及以下客户
     * @param queryCustomerVO
     * @return
     */
    List<Customer> queryDepartmentUnderCustomerList(QueryCustomerVO queryCustomerVO);

    /**
     * 查询所有客户
     * @param queryCustomerVO
     * @return
     */
    List<Customer> queryAllCustomerList(QueryCustomerVO queryCustomerVO);

    /**
     * 定制化查询客户
     * @param queryCustomerVO
     * @return
     */
    List<Customer> queryCustomCustomerList(QueryCustomerVO queryCustomerVO);
}
