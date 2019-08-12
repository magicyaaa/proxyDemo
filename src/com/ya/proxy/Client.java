package com.ya.proxy;

/**
 * @program: proxyDemo
 * @description:
 * @author: Ya
 * @create: 2019-08-06 22:43
 **/
public class Client {
    public static void main(String[] args) {
        //UserManager userManager=new UserManagerImpl();
        //UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());

        LogHandler logHandler = new LogHandler();
        UserManager userManager = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
        userManager.addUser("1111", "张三");
        Service1 service1 = (Service1) logHandler.newProxyInstance(new Service1Impl());
        String res = service1.method("test");

    }
}
