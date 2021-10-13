package com.company.adapter;

public class AdapterRunner {

    public static void main(String[] args) {

        Pigeon pigeon = new Pigeon();
        Sparrow sparrow = new Sparrow();
        PlasticToyDuck toyDuck = new PlasticToyDuck();

        ToyDuck adapter = new BirdAdapter(sparrow);

        System.out.println("Pigeon");
        pigeon.fly();
        pigeon.makeSound();

        System.out.println("--------");

        System.out.println("Plastic toy duck");
        toyDuck.squeak();

        System.out.println("--------");

        System.out.println("Adapter");
        adapter.squeak();
    }

}
