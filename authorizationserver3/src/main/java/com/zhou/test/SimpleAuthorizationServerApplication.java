package com.zhou.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @author 01384526
 * @title: SimpleAuthorizationServerApplication
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/818:17
 */
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SimpleAuthorizationServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleAuthorizationServerApplication.class, args);
    }
}
