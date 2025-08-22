package com.xworkz.inheritance;

public class Bike extends Vehicle
{
    private int engineCC;
    private String type;

    public void setEngineCC(int engineCC)
    {
        this.engineCC = engineCC;
    }
    public int getEngineCC()
    {
        return engineCC;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return type;
    }
}

