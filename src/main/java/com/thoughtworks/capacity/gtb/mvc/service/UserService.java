package com.thoughtworks.capacity.gtb.mvc.service;

import com.google.common.collect.Maps;
import com.thoughtworks.capacity.gtb.mvc.common.errors.ErrorCode;
import com.thoughtworks.capacity.gtb.mvc.common.exceptions.BadRequestException;
import com.thoughtworks.capacity.gtb.mvc.model.User;

import java.util.Map;

/**
 * Created by wudibin
 * 2020/11/4
 */
public class UserService {

    private Map<String, User> userMap = Maps.newHashMap();

    public UserService() {
        userMap.put("Mike", new User("Mike", "123", "mike@qq.com"));
        userMap.put("Jimmy", new User("Jimmy", "123", "jimmy@qq.com"));
    }

    public void register(User user) {
        if (userMap.containsKey(user.getUsername())) {
            throw new BadRequestException(ErrorCode.USERNAME_ALREADY_EXIST);
        }
        userMap.put(user.getUsername(), user);
    }
}
