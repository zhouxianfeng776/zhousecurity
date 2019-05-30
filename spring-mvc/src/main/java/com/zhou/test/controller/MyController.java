package com.zhou.test.controller;

import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @author 01384526
 * @title: MyController
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/2716:21
 */
@Api(tags = {"my"})
@RestController
@Validated //单个参数校验
public class MyController {

    @PostMapping("/my/{id}")
    public String test(@NotNull @PathVariable String id){
        return id;
    }
}
