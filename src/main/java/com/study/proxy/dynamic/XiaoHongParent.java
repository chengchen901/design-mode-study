package com.study.proxy.dynamic;

public class XiaoHongParent implements Girl {
    @Override
    public boolean dating(float length) {
        if (length > 1.7F) {
            System.out.println("XiaoHongParent 符合要求");
            return true;
        } else {
            System.out.println("XiaoHongParent 不符合要求，pass");
            return false;
        }
    }
}
