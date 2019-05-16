package com.zhou.test.sso.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 01384526
 * @title: MyController
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/1614:24
 */
@RestController
public class MyController {
    @PreAuthorize("hasAuthority('product:read')")
    @GetMapping("/test")
    public String message() {
        return "secret message";
    }

}
