package com.zhou.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

/**
 * @author 01384526
 * @title: WebSecurityConfiguration
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/2715:55
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    /**
     * 注意千万不能 super.configure(http);
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/","/csrf","/swagger-ui.html","/webjars/springfox-swagger-ui/**","/swagger-resources/**","/v2/api-docs").permitAll()
                .anyRequest().authenticated().and()
//                .httpBasic().and()
//                .formLogin().and()
        ;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(users.username("1").password("1").roles("USER").authorities("product:read"))
                .withUser(users.username("2").password("2").roles("USER", "ADMIN"));
    }
}
