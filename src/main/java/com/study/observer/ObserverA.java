package com.study.observer;

public class ObserverA implements Observer {
    @Override
    public void update(Object obj) {
        System.out.println("ObserverA 收到消息:" + obj);
    }
}
