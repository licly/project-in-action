package org.charlie.controller.vo.req;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;
import org.charlie.entity.staff.CustomerStaff;
import org.charlie.entity.staff.enums.Gender;
import org.charlie.entity.staff.enums.Status;

import java.time.LocalDateTime;

/**
 * {@link org.charlie.controller.CustomerStaffController#createCustomerStaff}请求体
 *
 * @author Charlie-6327
 * @date 2022/12/29
 */

@Data
@Accessors(chain = true)
public class CreateCustomerStaffReqVO {

    /**
     * 分组ID
     */
    private Long groupId;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 性别
     */
    private Gender gender;

    /**
     * 擅长领域
     */
    private String goodAt;


    /**
     * 欢迎语
     */
    private String welcomeMessage;

    /**
     * 备注
     */
    private String remark;

}
