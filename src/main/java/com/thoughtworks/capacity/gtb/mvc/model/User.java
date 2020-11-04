package com.thoughtworks.capacity.gtb.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * Created by wudibin
 * 2020/11/4
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Pattern(regexp = "[a-zA-Z0-9_]{3,10}")
    private String username;

    @NotBlank(message = "password must not be blank")
    @Size(min = 5, max = 12)
    private String password;

    @NotBlank(message = "email must not be blank")
    @Email
    private String email;

}
