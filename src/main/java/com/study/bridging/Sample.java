package com.study.bridging;

public class Sample {
    public static void main(String[] args) {
        Shape shape = new Circle(new Blue());
        shape.draw();
    }
}
