package com.zhou.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 01384526
 * @title: SimpleResourceServerApplication
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/1514:26
 */
@SpringBootApplication
public class SimpleResourceServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleResourceServerApplication.class, args);
    }
}
