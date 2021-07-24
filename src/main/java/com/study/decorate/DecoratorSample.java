package com.study.decorate;

public class DecoratorSample {
    public static void main(String[] args) {
        Component cc = new ConcreteComponent();
        cc = new DecoratorA(cc);
        System.out.println(cc.methodA());
        System.out.println(cc.methodB());
        cc = new DecoratorB(cc);
        System.out.println(cc.methodA());
        System.out.println(cc.methodB());
    }
}
