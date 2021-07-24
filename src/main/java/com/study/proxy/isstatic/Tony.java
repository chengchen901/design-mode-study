package com.study.proxy.isstatic;

public class Tony implements Girl {

    private Girl girl;

    public Tony(Girl girl) {
        this.girl = girl;
    }

    public boolean dating(float length) {
        // 前置增强
        doSomethingBefore();
        boolean res = this.girl.dating(length);
        // 后置增强
        doSomethingAfter();
        return res;
    }

    public void doSomethingBefore() {
        System.out.println("前置增强");
    }

    public void doSomethingAfter() {
        System.out.println("后置增强");
    }
}
