package com.thoughtworks.capacity.gtb.mvc;

import com.thoughtworks.capacity.gtb.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wudibin
 * 2020/11/4
 */

@Configuration
public class CorsConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }

}
