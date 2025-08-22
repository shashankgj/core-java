package com.xworkz.inheritance;

public class Car extends Vehicle
{
    private int seatingCapacity;
    private String fuelType;

    public void setSeatingCapacity(int seatingCapacity)
    {
        this.seatingCapacity = seatingCapacity;
    }
    public int getSeatingCapacity()
    {
        return seatingCapacity;
    }

    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }
    public String getFuelType()
    {
        return fuelType;
    }
}

