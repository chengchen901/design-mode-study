package com.study.observer;

import java.util.Vector;

public class Subject1 implements Subject {

    private Vector<Observer> observers;

    public Subject1() {
        this.observers = new Vector<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("这是一条来自公众号的消息");
        }
    }
}
