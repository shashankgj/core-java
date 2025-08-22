package com.xworkz.inheritance;

public class BusRunner
{
    public static void main(String[] args)
    {
        Bus bus = new Bus();
        bus.setName("Volvo AC Bus");
        bus.setCapacity(50);
        bus.setServiceType("Luxury");

        System.out.println(bus.getName() + " - " + bus.getCapacity() + " seats - " + bus.getServiceType());

        Bus bus1 = new Bus();
        bus1.setName("KSRTC Express");
        bus1.setCapacity(60);
        bus1.setServiceType("Ordinary");

        System.out.println(bus1.getName() + " - " + bus1.getCapacity() + " seats - " + bus1.getServiceType());
    }
}

