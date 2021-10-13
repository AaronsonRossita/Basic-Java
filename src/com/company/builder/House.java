package com.company.builder;

public class House {

    private boolean basement;
    private String roofType;
    private int windows;
    private int doors;

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Hi. I'm a house with " + windows
                + " windows and " + doors + " doors \n" +
                "my basement is " + basement + " and my roof is " + roofType ;
    }
}
