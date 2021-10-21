package com.company.bridge;

public class BridgeRunner {

    public static void main(String[] args) {

        Workshop assemble = new Assemble();
        Workshop produce = new Produce();

        Vehicle vehicle1 = new Car(new Assemble(), new Produce());
        Vehicle vehicle2 = new Bike(assemble, produce);

        vehicle1.manufacture();
        vehicle2.manufacture();

    }

    
}
