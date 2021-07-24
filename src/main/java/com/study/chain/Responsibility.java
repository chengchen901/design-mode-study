package com.study.chain;

public interface Responsibility {
    void process(String str, ResponsibilityChain chain);
}
