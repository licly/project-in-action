package org.charlie.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 控制层返回对象
 *
 * @author Charlie-6327
 * @date 2022/12/29
 */

@Data
@Accessors(chain = true)
public class Result<T> {

    private static final int OK = 200;
    private static final int ERROR = 500;

    private Integer status;

    private String errMsg;

    private T data;

    private String traceId;

    public static Result<Void> success() {
        return new Result<Void>().setStatus(OK);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>().setStatus(OK).setData(data);
    }

    public static Result<Void> error(String errMsg) {
        return new Result<Void>().setStatus(ERROR).setErrMsg(errMsg);
    }
}
