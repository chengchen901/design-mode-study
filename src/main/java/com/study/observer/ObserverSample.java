package com.study.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverSample {
    public static void main(String[] args) {
        test1();
//        test2();
    }

    public static void test1() {
        Observable subject1 = new Observable() {
            @Override
            public void notifyObservers(Object arg) {
                setChanged(); // 设置发生改变了
                super.notifyObservers(arg);
            }
        };

        subject1.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("观察者1收到了 " + arg);
            }
        });

        subject1.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("观察者2收到了 " + arg);
            }
        });
        subject1.notifyObservers("change1");
        subject1.notifyObservers("change2");
    }

    public static void test2() {
        Subject subject = new Subject1();
        com.study.observer.Observer a = new ObserverA();
        com.study.observer.Observer b = new ObserverB();
        com.study.observer.Observer c = new ObserverC();

        subject.addObserver(a);
        subject.addObserver(b);
        subject.addObserver(c);
        System.out.println("通知所有观察者");
        subject.notifyObservers();

        System.out.println("删除A观察者");
        subject.removeObserver(a);

        System.out.println("通知所有观察者");
        subject.notifyObservers();
    }
}
