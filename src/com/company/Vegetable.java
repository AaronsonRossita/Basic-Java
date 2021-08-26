package com.company;

public class Vegetable extends Food{

    private int calories;

    public Vegetable(String type, String company, int calories) {
        super(type, company);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "and it has " + calories + " calories";
    }
}
