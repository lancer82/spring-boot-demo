package com.thinlk.springbootdemo.controller;

import com.thinlk.springbootdemo.module.UserAddReqVO;
import com.thinlk.springbootdemo.module.UserDetailRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "我是DemoController")
public class TestController {

    @GetMapping("/hello")
    @ApiOperation(value = "哈喽")
    public String hello(@ApiParam(name = "name", value = "姓名", required = true)@RequestParam String name) {
        return "hello " + name;
    }

    @PostMapping("/user/add")
    @ApiOperation(value = "新增用户")
    public UserDetailRespVO addUser(@RequestBody UserAddReqVO req) {
        UserDetailRespVO resp = new UserDetailRespVO();
        resp.setId(9527L);
        resp.setName(req.getName());
        resp.setAge(req.getAge());
        return resp;
    }

    @DeleteMapping("/user/delete/{id}")
    @ApiOperation(value = "删除用户")
    public Boolean addUser(@ApiParam(name = "id", value = "数据id", required = true) @PathVariable Long id) {
        return true;
    }

    /**
     * 测试 @RequestBody、@RequestParam、@PathVariable并存
     */
    @PostMapping("/multi-anno/{id}")
    @ApiOperation(value = "组合使用测试")
    public UserDetailRespVO testMultiAnno(@RequestBody UserAddReqVO req,
                                          @ApiParam(name = "name", value = "姓名", required = true)
                                          @RequestParam String name,
                                          @ApiParam(name = "id", value = "数据id", required = true)
                                          @PathVariable Long id) {
        UserDetailRespVO resp = new UserDetailRespVO();
        resp.setId(9527L);
        resp.setName(req.getName());
        resp.setAge(req.getAge());
        return resp;
    }

}
