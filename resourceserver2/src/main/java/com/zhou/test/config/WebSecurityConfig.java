package com.zhou.test.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * @author 01384526
 * @title: WebSecurityConfig
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/818:36
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*http.antMatcher("/test2")
                .authorizeRequests()
                .mvcMatchers("/messages").hasAuthority("SCOPE_message:read")
                .anyRequest().authenticated()
        .and().httpBasic();*/
    }

}
