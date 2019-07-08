package com.zhou.test;

import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.config.annotation.web.AbstractRequestMatcherRegistry;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
@Slf4j
public class AppTest 
{
    public static void main(String[] args) {
        String path = "/swagger-mui.html";
        String regex = "/swagger.*";
        System.out.println(path.indexOf("m"));
        System.out.println(path.length() - 2);
        System.out.println(path.charAt(path.length() - 2));

        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put("a", "1");
        identityHashMap.put("a", "2");
        identityHashMap.put("a", "3");
        System.out.println(identityHashMap.size());

        System.out.println(identityHashMap.get("a"));
    }
}
