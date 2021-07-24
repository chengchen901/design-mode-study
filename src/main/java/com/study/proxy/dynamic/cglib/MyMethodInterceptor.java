package com.study.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {

    private Object target;

    private String flag;

    public MyMethodInterceptor(Object target) {
        this.target = target;
    }

    public MyMethodInterceptor(Object target, String flag) {
        this.target = target;
        this.flag = flag;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 前置增强
        doSomethingBefore();
        // 返回值
         Object result = null;
         if (flag != null) {
             // 调用父类的该方法，当是生成接口的代理时不可调用
             result = methodProxy.invokeSuper(proxy, args);
         } else {
             // 通过method来调用被代理对象的方法
             if (target != null) {
                 result = method.invoke(target, args);
             }
         }
        // 后置增强
        doSomethingAfter();
        return result;
    }

    private void doSomethingAfter() {
        System.out.println("后置增强" + flag);
    }

    private void doSomethingBefore() {
        System.out.println("前置增强" + flag);
    }
}
