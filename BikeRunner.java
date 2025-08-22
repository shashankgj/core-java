package com.xworkz.inheritance;

public class BikeRunner {

    public static void main(String[] args)
    {
        Bike bike = new Bike();
        bike.setName("Royal Enfield");
        bike.setEngineCC(350);
        bike.setType("Cruiser");

        System.out.println(bike.getName() + " - " + bike.getEngineCC() + "cc - " + bike.getType());

        Bike bike1 = new Bike();
        bike1.setName("KTM Duke");
        bike1.setEngineCC(390);
        bike1.setType("Sports");

        System.out.println(bike1.getName() + " - " + bike1.getEngineCC() + "cc - " + bike1.getType());
    }
}
