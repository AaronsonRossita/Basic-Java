package com.company.builder;

public class HouseEngineer {

    private HouseBuilder houseBuilder;

    public HouseEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        constructHouse();
        return this.houseBuilder.buildHouse();
    }

    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildRoofType();
        this.houseBuilder.buildDoors();
        this.houseBuilder.buildWindows();
    }
}
