package com.xworkz.inheritance;

public class Bus extends Vehicle
{
    private int capacity;
    private String serviceType;

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    public int getCapacity()
    {
        return capacity;
    }

    public void setServiceType(String serviceType)
    {
        this.serviceType = serviceType;
    }
    public String getServiceType()
    {
        return serviceType;
    }
}

