package com.thoughtworks.capacity.gtb.mvc.common.exceptions;

import com.thoughtworks.capacity.gtb.mvc.common.errors.ErrorCode;
import lombok.Getter;

/**
 * Created by wudibin
 * 2020/11/4
 */

class HttpException extends RuntimeException {

    @Getter
    private ErrorCode errorCode;

    private HttpException(ErrorCode code, String message) {
        super(message);
        this.errorCode = code;
    }

    HttpException(ErrorCode code) {
        this(code, code.getMessage());
    }

}
