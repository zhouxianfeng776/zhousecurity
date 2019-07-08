package com.zhou.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author 01384526
 * @title: SpringMvcApplication
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/2715:53
 */
@MapperScan("com.zhou.test.mapper")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableAsync
@EnableScheduling
@Async
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }
}
