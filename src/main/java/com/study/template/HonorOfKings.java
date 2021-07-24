package com.study.template;

public class HonorOfKings extends Game {
    @Override
    protected void initialize() {
        System.out.println("HonorOfKings initialize");
    }

    @Override
    protected void startPlay() {
        System.out.println("HonorOfKings startPlay");
    }

    @Override
    protected void endPlay() {
        System.out.println("HonorOfKings endPlay");
    }
}
