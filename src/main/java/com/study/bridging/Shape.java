package com.study.bridging;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    protected abstract void draw();
}
