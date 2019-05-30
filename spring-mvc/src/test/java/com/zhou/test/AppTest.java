package com.zhou.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.config.annotation.web.AbstractRequestMatcherRegistry;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
        String path="/swagger-ui.html";
        String regex="/swagger.*";
        System.out.println(path.matches(regex));

    }
}
