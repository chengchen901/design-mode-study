package com.study.proxy.dynamic.jdk;

import com.study.proxy.dynamic.*;

public class PayGame {
    public static void main(String[] args) {
        TuHao tuHao = new TuHao(1.75F);
        Girl girl = new XiaoHong();
        Girl proxy = (Girl) TonyCompany.proxy(girl);
        tuHao.dating(proxy);

        Boy xiaoMing = new XiaoMing();
        Boy proxyBoy = (Boy) TonyCompany.proxy(xiaoMing);
        proxyBoy.dating();

        System.out.println(proxyBoy.getClass().getName());
        ProxyUtils.generateClassFile(Boy.class, proxyBoy.getClass().getName());
    }
}
