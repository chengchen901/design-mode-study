package com.study.single;

public class Singleton1 {
    private final static Singleton1 INSTANCE;

    private Singleton1() {
    }

    static {
        INSTANCE = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
