package com.zhou.test.common.controller;

/**
 * @author 01384526
 * @title: A
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/8/2715:42
 */
public class A {
    ApplicationController.B b;

    public A(ApplicationController.B b) {
        this.b = b;
    }

    @Override
    public void finalize() {
        System.out.println("A finalize");
        C.a = this;
    }
}
