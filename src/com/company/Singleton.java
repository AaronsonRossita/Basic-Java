package com.company;

public class Singleton {

    Singleton instance = null;

    private Singleton() {
    }

    public Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }


}
