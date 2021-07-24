package com.study.chain;

public class ResponsibilityA implements Responsibility {
    @Override
    public void process(String str, ResponsibilityChain chain) {
        str = str + " ResponsibilityA";
        System.out.println("Responsibility-A dome something");
        System.out.println(str);
        chain.process(str);
    }
}
