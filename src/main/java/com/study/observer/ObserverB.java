package com.study.observer;

public class ObserverB implements Observer {
    @Override
    public void update(Object obj) {
        System.out.println("ObserverB 收到消息:" + obj);
    }
}
