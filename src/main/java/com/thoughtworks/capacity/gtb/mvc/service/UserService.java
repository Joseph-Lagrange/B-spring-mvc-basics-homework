package com.thoughtworks.capacity.gtb.mvc.service;

import com.google.common.collect.Maps;
import com.thoughtworks.capacity.gtb.mvc.common.errors.ErrorCode;
import com.thoughtworks.capacity.gtb.mvc.common.exceptions.BadRequestException;
import com.thoughtworks.capacity.gtb.mvc.domain.User;
import com.thoughtworks.capacity.gtb.mvc.model.RegisterRequest;

import java.util.Map;

/**
 * Created by wudibin
 * 2020/11/4
 */

public class UserService {

    private Map<String, User> userMap = Maps.newHashMap();

    public UserService() {
        userMap.put("Mike", User.builder().id(1).username("Mike").password("123456").email( "mike@qq.com").build());
        userMap.put("Jimmy", User.builder().id(2).username("Jimmy").password("123456").email( "jimmy@qq.com").build());
    }

    public void register(RegisterRequest request) {
        if (userMap.containsKey(request.getUsername())) {
            throw new BadRequestException(ErrorCode.USERNAME_ALREADY_EXIST);
        }
        userMap.put(request.getUsername(), User.builder()
                .id(userMap.size() + 1)
                .username(request.getUsername())
                .password(request.getPassword())
                .email(request.getEmail())
                .build());
    }
}
