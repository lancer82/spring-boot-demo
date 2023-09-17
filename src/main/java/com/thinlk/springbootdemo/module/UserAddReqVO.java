package com.thinlk.springbootdemo.module;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class UserAddReqVO {
    @ApiModelProperty(value = "姓名",required = true)
    @NotBlank(message = "姓名不能为空")
    private String name;

    @ApiModelProperty("年龄")
    private Integer age;
}
