package com.thoughtworks.capacity.gtb.mvc.common.errors;

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
public class ErrorResult {

    private int code;

    private String message;

}
