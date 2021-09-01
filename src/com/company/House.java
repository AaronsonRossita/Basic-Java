package com.company;

public class House {

    private int windows;
    private String roofType;
    private boolean lawn;

    public House(){

    }

    public House(int windows){
        this.windows = windows;
    }

    public House(int windows, String roofType, boolean lawn) {
        this.windows = windows;
        this.roofType = roofType;
        this.lawn = lawn;
    }

    public House(House house) {
        this.windows = house.windows;
        this.roofType = house.roofType;
        this.lawn = house.lawn;
    }


    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public boolean isLawn() {
        return lawn;
    }

    public void setLawn(boolean lawn) {
        this.lawn = lawn;
    }

    @Override
    public String toString() {
//        return super.toString();   //super refers to the default toString
        return "This house has " + windows + " windows, the roof is "
                + roofType + " and the lawn is " + lawn;
    }
}
