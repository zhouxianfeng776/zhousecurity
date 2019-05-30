package com.zhou.test.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author 01384526
 * @title: TestController
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/2716:37
 */
@Api(tags = {"test"})
@RestController
@Validated
public class TestController {


    @Autowired
    private Validator validator;

    @GetMapping("/test/{id}")
    public String test(@PathVariable String id){
        return id;
    }

    @GetMapping("/")
    public String test11(){
        return "111111111111111111";
    }

    @PostMapping("/test/{id}")
    public String test1(@PathVariable String id){
        return id;
    }
}
