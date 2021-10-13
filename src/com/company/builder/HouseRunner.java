package com.company.builder;

public class HouseRunner {

    public static void main(String[] args) {

        FamilyHouseBuilder fhb = new FamilyHouseBuilder();
        //BachelorPadBuilder bpb = new BachelorPadBuilder();
        HouseEngineer engineer = new HouseEngineer(fhb);

        System.out.println(engineer.getHouse());
        House house = engineer.getHouse();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(6).append('a').append(4.5);
        System.out.println(stringBuilder);
    }

}
