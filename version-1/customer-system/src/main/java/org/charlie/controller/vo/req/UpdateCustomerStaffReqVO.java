package org.charlie.controller.vo.req;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.charlie.entity.staff.CustomerStaff;
import org.charlie.entity.staff.enums.Gender;
import org.charlie.entity.staff.enums.Status;

import java.time.LocalDateTime;

/**
 * {@link org.charlie.controller.CustomerStaffController#updateCustomerStaff}请求参数
 *
 * @author Charlie-6327
 * @date 2022/12/29
 */

@Data
@Accessors(chain = true)
public class UpdateCustomerStaffReqVO {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

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
     * 擅长领域
     */
    private String goodAt;

    /**
     * 欢迎语
     */
    private String welcomeMessage;

    /**
     * 状态：1：在线，0：下线
     */
    private Status status;

    /**
     * 备注
     */
    private String remark;

}
