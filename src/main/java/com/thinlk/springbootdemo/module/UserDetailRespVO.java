package com.thinlk.springbootdemo.module;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserDetailRespVO {
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("年龄")
    private Integer age;
}
