package org.charlie.controller;

import org.charlie.controller.vo.req.CreateCustomerStaffReqVO;
import org.charlie.entity.staff.CustomerStaff;
import org.charlie.page.PageObject;
import org.charlie.service.CustomerStaffService;
import org.charlie.vo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static org.charlie.converter.CustomerStaffConverter.INSTANCE;

/**
 * @author Charlie-6327
 * @date 2022/12/29
 */

@RestController
@RequestMapping("/customerStaff")
public class CustomerStaffController {

    @Resource
    private CustomerStaffService service;

    public PageObject<CustomerStaff> findCustomerStaffs(Long pageIndex, Long pageSie) {
        return service.findCustomerStaffs(pageIndex, pageSie);
    }

    public PageObject<CustomerStaff> findCustomerStaffsByName(String name, Long pageIndex, Long pageSie) {
        return null;
    }

    public CustomerStaff findCustomerStaffById(Long staffId) {
        return null;
    }

    @PostMapping("/")
    public Result<Long> createCustomerStaff(@RequestBody CreateCustomerStaffReqVO param) {
        CustomerStaff customerStaff = INSTANCE.convertCreateReq(param);
        service.createCustomerStaff(customerStaff);
        return Result.success(customerStaff.getId());
    }

    public Boolean updateCustomerStaff(CustomerStaff customerStaff) {
        return null;
    }

    public Boolean deleteCustomerStaffById(Long staffId) {
        return null;
    }
}
