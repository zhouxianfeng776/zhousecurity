package com.zhou.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 01384526
 * @title: TestController
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/1413:53
 */
@RestController
public class TestController {

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasAuthority('ROLE_TELLER')")
    //@PreAuthorize("isAnonymous()")
    public String hasRoleAdmin(){
        return "admin success";
    }

    @RequestMapping("/product")
    @PreAuthorize("hasAuthority('product:read')")
    //@PreAuthorize("isAnonymous()")
    public String hasAuthority(){
        return "admin success";
    }
}
