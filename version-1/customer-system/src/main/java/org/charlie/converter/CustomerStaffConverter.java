package org.charlie.converter;

import org.charlie.controller.vo.req.CreateCustomerStaffReqVO;
import org.charlie.controller.vo.req.UpdateCustomerStaffReqVO;
import org.charlie.entity.staff.CustomerStaff;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Charlie-6327
 * @date 2022/12/29
 */

@Mapper
public interface CustomerStaffConverter {

    CustomerStaffConverter INSTANCE = Mappers.getMapper(CustomerStaffConverter.class);

    CustomerStaff convertCreateReq(CreateCustomerStaffReqVO req);

    CustomerStaff convertUpdateReq(UpdateCustomerStaffReqVO req);
}
