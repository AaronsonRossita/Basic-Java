package com.company.adapter;

public class Pigeon implements Bird {

    @Override
    public void fly() {
        System.out.println("the pigeon is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("the pigeon makes sound");
    }
}
