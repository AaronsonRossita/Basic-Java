package com.company;

public class Fruit extends Food{

    private String name;

    public Fruit(String type, String company, String name){
        super(type,company); // super refers to the default o original method
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void smthng (){
        System.out.println("hi");
    };

    @Override
    protected void spoil() {
        super.spoil();
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "and its called " + name;
    }

    @Override
    public boolean equals(Object obj) {
        Fruit fruit = (Fruit) obj;
        if (this.name.equals(fruit.getName())) {
            return true;
        }else{
            return false;
        }
    }
}
