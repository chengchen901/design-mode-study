package com.study.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doSomethingBefore();
        Object res = method.invoke(target, args);
        doSomethingAfter();
        return res;
    }

    private void doSomethingAfter() {
        System.out.println("后置增强");
    }

    private void doSomethingBefore() {
        System.out.println("前置增强");
    }
}
