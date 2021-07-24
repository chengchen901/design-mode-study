package com.study.proxy.dynamic;

import com.study.proxy.dynamic.jdk.MyInvocationHandler;

import java.lang.reflect.Proxy;

public class TonyCompany {
    public static Object proxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new MyInvocationHandler(target));
    }
}
