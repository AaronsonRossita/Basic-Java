package com.company.factory;

public class ShapeFactory {

    public Shape getObject (String s, int x){

//        if (s.toLowerCase().equals("circle")){
//            return new Circle(x);
//        }else if (s.toLowerCase().equals("square")){
//            return new Square(x);
//        }else{
//            return null;
//        }

        switch (s){
            case Shape.CIRCLE:
                return new Circle(x);
            case Shape.SQUARE:
                return new Square(x);
            default:
                return null;
        }

//        return (s.toLowerCase().equals(Shape.CIRCLE)) ? new Circle(x) : new Square(x);

    }
}
