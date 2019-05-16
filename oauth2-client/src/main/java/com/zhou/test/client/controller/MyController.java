package com.zhou.test.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
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

    @Autowired
    OAuth2RestTemplate oAuth2RestTemplate;

    @GetMapping("/test")
    public String message() {
        return oAuth2RestTemplate.getForObject("http://localhost:8084/messages", String.class);
    }

}
