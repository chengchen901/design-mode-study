package com.study.chain;

public class ResponsibilityB implements Responsibility {
    @Override
    public void process(String str, ResponsibilityChain chain) {
        str = str + " ResponsibilityB";
        System.out.println("Responsibility-B dome something");
        System.out.println(str);
        chain.process(str);
    }
}
