package com.company.singleton;

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
