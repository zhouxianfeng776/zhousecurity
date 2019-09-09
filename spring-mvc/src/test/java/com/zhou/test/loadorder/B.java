package com.zhou.test.loadorder;

/**
 * @author 01384526
 * @title: B
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/8/2811:22
 */
public class B extends A {
    public String ss1 = prtString("B的成员变量...");
    public static String ss2 = prtString("B的static变量...");


    public B() {
        super();
        System.out.println("B的构造函数...");
    }

    private static A a = new A();


    static {
        System.out.println("B的static代码块...");
    }


    {
        System.out.println("B的代码块...");
    }
}
