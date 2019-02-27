package com.liuxscomp.common.exception;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException extends Exception {


    /** 异常描述 */
    protected String msg;
    /** 异常代码编号 */
    protected String errorCode;

    public String toString() {
        return errorCode + ": " + msg;
    }
    public BaseException(String errorCode, String msg) {
        this.msg = msg;
        this.errorCode = errorCode;
    }
}
