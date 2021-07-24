package com.study.single;

public class Singleton3 {
    private Singleton3() {
    }

    private static class SingletonInstance {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
