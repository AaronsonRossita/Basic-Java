package com.company.builder;

public interface HouseBuilder {

    void buildBasement();
    void buildRoofType();
    void buildWindows();
    void buildDoors();

    House buildHouse();

}
