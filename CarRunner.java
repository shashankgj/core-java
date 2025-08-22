package com.xworkz.inheritance;

public class CarRunner {

    public static void main(String[] args)
    {
        Car car = new Car();
        car.setName("Tesla Model S");
        car.setSeatingCapacity(5);
        car.setFuelType("Electric");

        System.out.println(car.getName() + " - " + car.getSeatingCapacity() + " seats - " + car.getFuelType());

        Car car1 = new Car();
        car1.setName("Maruti Suzuki");
        car1.setSeatingCapacity(5);
        car1.setFuelType("Petrol");

        System.out.println(car1.getName() + " - " + car1.getSeatingCapacity() + " seats - " + car1.getFuelType());
    }
}

