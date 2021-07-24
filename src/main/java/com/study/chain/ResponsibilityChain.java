package com.study.chain;

import java.util.ArrayList;
import java.util.List;

public class ResponsibilityChain {

    private List<Responsibility> responsibilityList;
    private int index = 0;

    public ResponsibilityChain() {
        responsibilityList = new ArrayList<>();
    }

    public void process(String str) {
        if (this.index < this.responsibilityList.size()) {
            this.responsibilityList.get(index++).process(str, this);
        }
    }

    public void register(Responsibility res) {
        this.responsibilityList.add(res);
    }
}
