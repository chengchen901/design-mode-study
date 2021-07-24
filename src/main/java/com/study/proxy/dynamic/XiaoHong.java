package com.study.proxy.dynamic;

public class XiaoHong extends XiaoHongParent implements Girl {
    public boolean dating(float length) {
        if (length > 1.7F) {
            System.out.println("XiaoHong 符合要求");
            return true;
        } else {
            System.out.println("XiaoHong 不符合要求，pass");
            return false;
        }
    }
}
