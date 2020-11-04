package com.thoughtworks.capacity.gtb.mvc.common.exceptions;

import com.thoughtworks.capacity.gtb.mvc.common.errors.ErrorCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by wudibin
 * 2020/11/4
 */

public class BadRequestException extends HttpException {

    public BadRequestException(ErrorCode code) {
        super(code);
    }

}
