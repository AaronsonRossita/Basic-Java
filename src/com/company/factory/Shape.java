package com.company.factory;

public interface Shape {

    double PHI = 3.14;
    String CIRCLE = "circle";
    String SQUARE = "square";

    void draw();
    void getPerimeter();

    default void className(){
        System.out.println("I'm a Shape");
    }

}
