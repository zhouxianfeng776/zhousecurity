package com.zhou.test.sso.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author 01384526
 * @title: OAuth2ClientSecurityConfig
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/1614:11
 */
@EnableOAuth2Sso
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class OAuth2ClientSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    }
}
