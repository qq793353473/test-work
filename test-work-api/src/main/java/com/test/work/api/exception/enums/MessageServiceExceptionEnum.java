package com.test.work.api.exception.enums;

import cn.stylefeng.roses.kernel.model.exception.AbstractBaseExceptionEnum;

/**
 * 鉴权相关的错误异常
 *
 */
public enum MessageServiceExceptionEnum implements AbstractBaseExceptionEnum {

    MESSAGE_SEN_ERROR(8001001, "消息发送异常"),
    ;

    private int code;
    private String message;

    MessageServiceExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
