package com.xworkz.abstraction;

public class VehicleRunner {
    public static void main(String[] args)
    {
        Vehicle vehicle = new Bus();
        vehicle.VehicleType();

        Vehicle vehicle1 = new Car();
        vehicle1.VehicleType();
    }
}
