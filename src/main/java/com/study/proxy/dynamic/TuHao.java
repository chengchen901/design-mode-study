package com.study.proxy.dynamic;


public class TuHao {
    private float length;

    public TuHao(float length) {
        this.length = length;
    }

    public void dating(Girl g) {
        g.dating(length);
    }
}
