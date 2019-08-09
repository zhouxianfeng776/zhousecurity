package com.zhou.test;

/**
 * @author 01384526
 * @title: TestList
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/7/1217:20
 */

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;
import java.util.*;

public class TestList {
    public static final int N = 50000;

    public static List values;

    static {
        Integer vals[] = new Integer[N];

        Random r = new Random();

        for (int i = 0, currval = 0; i < N; i++) {
            currval += r.nextInt(100) + 1;
            vals[i] = new Integer(currval);
        }

        values = Arrays.asList(vals);
    }

    static long timeList(List lst) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            lst.get(i);
        }
        return System.currentTimeMillis() - start;
    }

    public static void main(String args[]) {
        BloomFilter<String> filter = BloomFilter.create(Funnels.stringFunnel(Charset.forName("utf-8")), 1000000000,0.001);

        filter.put("A");
        filter.put("B");
        filter.put("C");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}