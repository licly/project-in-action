package org.charlie.service.impl;

import org.charlie.entity.staff.CustomerStaff;
import org.charlie.page.PageObject;
import org.charlie.service.CustomerStaffService;
import org.springframework.stereotype.Service;

/**
 * @author Charlie-6327
 * @date 2022/12/28
 */

@Service
public class CustomerStaffServiceImpl implements CustomerStaffService {


    @Override
    public PageObject<CustomerStaff> findCustomerStaffs(Long pageIndex, Long pageSie) {
        return null;
    }

    @Override
    public PageObject<CustomerStaff> findCustomerStaffsByName(String name, Long pageIndex, Long pageSie) {
        return null;
    }

    @Override
    public CustomerStaff findCustomerStaffById(Long staffId) {
        return null;
    }

    @Override
    public Boolean createCustomerStaff(CustomerStaff customerStaff) {
        return null;
    }

    @Override
    public Boolean updateCustomerStaff(CustomerStaff customerStaff) {
        return null;
    }

    @Override
    public Boolean deleteCustomerStaffById(Long staffId) {
        return null;
    }
}
