package com.company.factory;

import java.util.Scanner;

public class FactoryRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ShapeFactory factory = new ShapeFactory();

        System.out.println("Please provide a shape");
        String shapeString = scanner.next();
        System.out.println("Please provide the size");
        int shapeX = scanner.nextInt();

        Shape shape = factory.getObject(shapeString,shapeX);

        try {
            shape.className();
            shape.draw();
            shape.getPerimeter();
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

        System.out.println("I'm still working");
    }

}
