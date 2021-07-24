package com.study.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimgleSample {

    public static void main(String[] args) {
        Singleton4 instance = Singleton4.INSTANCE;
        instance.whateverMethod();
    }
}
