package com.ya;

/**
 * @program: proxyDemo
 * @description:
 * @author: Ya
 * @create: 2019-08-06 23:53
 **/
public class Service1Impl implements Service1 {

    @Override
    public String method(String s1) {
        System.out.println("System.out...... -> ===========" + s1);
        return "s1";
    }
}
