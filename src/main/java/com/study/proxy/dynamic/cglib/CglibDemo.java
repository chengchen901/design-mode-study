package com.study.proxy.dynamic.cglib;

import com.study.proxy.dynamic.Girl;
import com.study.proxy.dynamic.XiaoHong;
import com.study.proxy.dynamic.XiaoHongParent;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Method;

public class CglibDemo {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        Enhancer e = new Enhancer();
        Girl xiaoHong = new XiaoHong();
        e.setCallback(new MyMethodInterceptor(xiaoHong));
        e.setInterfaces(new Class[]{Girl.class});
        Girl g = (Girl) e.create();
        g.dating(1.8F);
    }

    public static void test2() {
        Enhancer e = new Enhancer();
        Girl xiaoHong = new XiaoHong();
        e.setCallbacks(new Callback[]{new MyMethodInterceptor(xiaoHong, "1"),
                new MyMethodInterceptor(xiaoHong, "2")});
        e.setSuperclass(XiaoHongParent.class);
        // 当有多个callback时，需要通过callbackFilter来指定被代理方法使用第几个callback
        e.setCallbackFilter(new CallbackFilter() {
            @Override
            public int accept(Method method) {
                // 可以根据不同方法名设置不同增强回调
                System.out.println(method.getName());
                return 1;
            }
        });
        XiaoHongParent g = (XiaoHongParent) e.create();
        g.dating(1.5F);
    }
}
