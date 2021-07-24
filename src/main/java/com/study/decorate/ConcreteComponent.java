package com.study.decorate;

public class ConcreteComponent implements Component {
    public String methodA() {
        return "concrete-object";
    }

    public int methodB() {
        return 100;
    }
}
