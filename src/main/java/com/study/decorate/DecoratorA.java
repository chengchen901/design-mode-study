package com.study.decorate;

public class DecoratorA extends Decorator {

    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public String methodA() {
        return this.component.methodA() + "+A";
    }

    @Override
    public int methodB() {
        return this.component.methodB() + 10;
    }
}
