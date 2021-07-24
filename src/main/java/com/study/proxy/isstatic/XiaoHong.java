package com.study.proxy.isstatic;

public class XiaoHong implements Girl {
    public boolean dating(float length) {
        if (length > 1.7F) {
            System.out.println("符合要求");
            return true;
        } else {
            System.out.println("不符合要求，pass");
            return false;
        }
    }
}
