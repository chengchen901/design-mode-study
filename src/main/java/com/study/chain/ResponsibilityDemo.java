package com.study.chain;

public class ResponsibilityDemo {
    public static void main(String[] args) {
        ResponsibilityChain chain = new ResponsibilityChain();
        Responsibility resA = new ResponsibilityA();
        chain.register(resA);
        Responsibility resB = new ResponsibilityB();
        chain.register(resB);
        chain.process("hello world");
    }
}
