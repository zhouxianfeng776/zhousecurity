package com.zhou.test.loadorder;

/**
 * @author 01384526
 * @title: A
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/8/2811:21
 */
public class A {
    static {
        System.out.println("A的static代码块...");
    }

    public static String s2 = prtString("A的static变量...");


    protected A() {
        System.out.println("A的构造函数...");
    }


    {
        System.out.println("A的代码块");
    }


    public static String prtString(String str) {
        System.out.println(str);
        return null;
    }

}
