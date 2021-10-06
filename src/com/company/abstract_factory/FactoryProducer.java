package com.company.abstract_factory;

public class FactoryProducer {

    public AbstractFactory getFactory(String type){

        if (type.equals("rounded")){
            return new RoundedShapeFactory();
        }else if (type.equals("regular")){
            return new RegularShapeFactory();
        }else{
            return null;
        }

    }

}
