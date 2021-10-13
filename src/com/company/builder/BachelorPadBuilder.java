package com.company.builder;

public class BachelorPadBuilder implements HouseBuilder {

    private House house;

    public BachelorPadBuilder() {
        house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement(false);
    }

    @Override
    public void buildRoofType() {
        house.setRoofType("whatever");
    }

    @Override
    public void buildWindows() {
        house.setWindows(3);
    }

    @Override
    public void buildDoors() {
        house.setDoors(1);
    }

    @Override
    public House buildHouse() {
        return house;
    }


}
