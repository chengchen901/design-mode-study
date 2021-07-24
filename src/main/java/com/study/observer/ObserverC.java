package com.study.observer;

public class ObserverC implements Observer {
    @Override
    public void update(Object obj) {
        System.out.println("ObserverC 收到消息:" + obj);
    }
}
