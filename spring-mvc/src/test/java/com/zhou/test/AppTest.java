package com.zhou.test;

import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.config.annotation.web.AbstractRequestMatcherRegistry;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
@Slf4j
public class AppTest 
{
    public static void main(String[] args) {
        /*String path = "/swagger-mui.html";
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

        List<String> list= Lists.newArrayList();*/


        /*String s="receiver";
        s.replaceFirst("01234)","");*/
        List<String> list=Lists.newArrayList("1","2");
        System.out.println(StringUtils.join(list,","));

        String s="周先锋";
        System.out.println(s.length());

        String regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{4,16}$";

    }
}
