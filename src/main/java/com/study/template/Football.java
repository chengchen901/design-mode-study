package com.study.template;

public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football initialize");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football startPlay");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football endPlay");
    }
}
