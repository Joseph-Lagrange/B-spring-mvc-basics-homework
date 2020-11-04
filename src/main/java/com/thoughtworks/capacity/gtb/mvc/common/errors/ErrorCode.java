package com.thoughtworks.capacity.gtb.mvc.common.errors;

import com.google.common.collect.ImmutableSet;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by wudibin
 * 2020/11/4
 */

public enum ErrorCode {

    USERNAME_ALREADY_EXIST(10000, "username is already exist"),
    USER_NOT_REGISTER(10001, "user is not register"),
    PASSWORD_IS_INVALID(10002, "password is invalid");

    private static final Set<String> ERROR_CODE_VALUES = ImmutableSet.copyOf(
            Arrays.stream(values()).map(Enum::toString).collect(Collectors.toSet())
    );

    private final int code;

    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static boolean contains(String code) {
        return ERROR_CODE_VALUES.contains(code);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
