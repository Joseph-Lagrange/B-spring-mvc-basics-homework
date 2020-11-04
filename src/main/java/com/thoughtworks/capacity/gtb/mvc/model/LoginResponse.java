package com.thoughtworks.capacity.gtb.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wudibin
 * 2020/11/4
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {

    private int id;

    private String username;

    private String password;

    private String email;

}
