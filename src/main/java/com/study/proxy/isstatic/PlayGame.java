package com.study.proxy.isstatic;

public class PlayGame {
    public static void main(String[] args) {
        TuHao tuHao = new TuHao(1.7F);
        Girl girl = new XiaoHong();
        Tony tony = new Tony(girl);
        tuHao.dating(tony);
    }
}
