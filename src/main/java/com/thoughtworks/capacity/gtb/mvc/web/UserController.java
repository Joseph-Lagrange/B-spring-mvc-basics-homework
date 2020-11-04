package com.thoughtworks.capacity.gtb.mvc.web;

import com.thoughtworks.capacity.gtb.mvc.model.LoginResponse;
import com.thoughtworks.capacity.gtb.mvc.model.RegisterRequest;
import com.thoughtworks.capacity.gtb.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by wudibin
 * 2020/11/4
 */

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody @Valid RegisterRequest request) {
        userService.register(request);
    }

    @GetMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public LoginResponse login(@RequestParam(name = "username") @Pattern(regexp = "[a-zA-Z0-9_]{3,10}") String username,
                               @RequestParam(name = "password") @Size(min = 5, max = 12) String password) {
        return userService.login(username, password);
    }


}
