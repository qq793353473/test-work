package com.test.work.api.exception;

import cn.stylefeng.roses.kernel.model.exception.AbstractBaseExceptionEnum;
import cn.stylefeng.roses.kernel.model.exception.ServiceException;

/**
 * 系统管理服务抛出的异常
 *
 */
public class MessageServiceException extends ServiceException {

    public MessageServiceException(AbstractBaseExceptionEnum exception) {
        super(exception);
    }

    public MessageServiceException(Integer code, String errorMessage) {
        super(code, errorMessage);
    }

    @Override
    public Throwable fillInStackTrace() {
        //覆写fillInStackTrace()，防止出现性能低效，不记录堆栈信息。
        return this;
    }
}
