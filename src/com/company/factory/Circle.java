package com.company.factory;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("o");
    }

    @Override
    public void getPerimeter() {
        System.out.println(2 * Shape.PHI * radius);
    }

    @Override
    public void className() {
        System.out.println("I'm a Circle");
    }
}
