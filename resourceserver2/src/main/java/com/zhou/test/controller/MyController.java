package com.zhou.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 01384526
 * @title: MyController
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/1514:59
 */
@RestController
public class MyController {

    /*@GetMapping("/")
    public String index(@AuthenticationPrincipal Jwt jwt) {
        return String.format("Hello, %s!", jwt.getSubject());
    }*/

    //@PreAuthorize("hasAuthority('SCOPE_message:read')")
    @GetMapping("/messages")
    public String message() {
        return "secret message";
    }
}
