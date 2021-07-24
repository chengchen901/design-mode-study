package com.study.decorate;

public class DecoratorB extends Decorator {
    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public String methodA() {
        return super.methodA() + "B";
    }

    @Override
    public int methodB() {
        return super.methodB() + 100;
    }
}
