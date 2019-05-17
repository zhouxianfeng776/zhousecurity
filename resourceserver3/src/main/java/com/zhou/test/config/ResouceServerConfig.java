package com.zhou.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * @author 01384526
 * @title: ResouceServerConfig
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/1514:27
 */
@Configuration
@EnableResourceServer
@EnableGlobalAuthentication
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResouceServerConfig extends ResourceServerConfigurerAdapter {


    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("test1");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers().antMatchers("/messages/**").and()
                .authorizeRequests()
                .mvcMatchers("/messages/**").access("#oauth2.hasScope('read') and #oauth2.isOAuth()")
                .anyRequest().authenticated();
       /* .and()
        .oauth2ResourceServer().jwt();*/
    }
}
