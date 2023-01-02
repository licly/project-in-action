package org.charlie.service;

import org.charlie.entity.staff.CustomerStaff;
import org.charlie.page.PageObject;

/**
 * 客服人员服务
 *
 * @author Charlie-6327
 * @date 2022/12/28
 */
public interface CustomerStaffService {

    PageObject<CustomerStaff> findCustomerStaffs(Long pageIndex, Long pageSie);

    PageObject<CustomerStaff> findCustomerStaffsByName(String name, Long pageIndex, Long pageSie);

    CustomerStaff findCustomerStaffById(Long staffId);

    Boolean createCustomerStaff(CustomerStaff customerStaff);

    Boolean updateCustomerStaff(CustomerStaff customerStaff);

    Boolean deleteCustomerStaffById(Long staffId);
}
