package com.company.builder;

public class FamilyHouseBuilder implements HouseBuilder {

    private House house;

    public FamilyHouseBuilder() {
        house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement(true);
    }

    @Override
    public void buildRoofType() {
        house.setRoofType("classic");
    }

    @Override
    public void buildWindows() {
        house.setWindows(6);
    }

    @Override
    public void buildDoors() {
        house.setDoors(2);
    }

    @Override
    public House buildHouse() {
        return house;
    }
}
