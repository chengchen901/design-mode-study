package com.study.bridging;

public class Circle extends Shape {
    private Color color;

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("绘制图形");
    }
}
