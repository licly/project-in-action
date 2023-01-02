package org.charlie.entity.staff;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.charlie.entity.staff.enums.Gender;
import org.charlie.entity.staff.enums.Status;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 客服人员表
 *
 * @author Charlie-6327
 * @date 2022/12/28
 */

@Data
@EqualsAndHashCode
@Accessors(chain = true)
public class CustomerStaff {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 分组ID
     */
    private Long groupId;

    /**
     * 客服人员姓名
     */
    private String staffName;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 账号ID
     */
    private  Long accountId;

    /**
     * 外部系统ID
     */
    private Long systemId;

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
     * 是否自动回复
     */
    private Boolean autoReply;

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

    /**
     * 是否删除：1=删除，0=未删除
     */
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;
}
