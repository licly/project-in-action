package org.charlie.entity.staff.enums;

/**
 * 在线状态
 *
 * @author Charlie-6327
 * @date 2022/12/28
 */
public enum Status {

    ONLINE(1), OFFLINE(0);

    private int status;

    Status(Integer status) {
        this.status = status;
    }
}
