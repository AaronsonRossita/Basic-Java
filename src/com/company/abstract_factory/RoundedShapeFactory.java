package com.company.abstract_factory;

public class RoundedShapeFactory implements AbstractFactory {

    private Shape getRoundedShape(String s){
        if (s.equals("square")){
            return new RoundedSquare();
        }else{
            return new RoundedRectangle();
        }
    }

    @Override
    public Shape getShape() {
        return getRoundedShape("");
    }
}
