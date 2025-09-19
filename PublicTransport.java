package com.xworkz.abstraction;

public class PublicTransport implements Metro, Bmtc {

    @Override
    public void speed(int a) {
        System.out.println("Metro running at speed: " + a + " km/h");
    }

    @Override
    public void source(String sou) {
        System.out.println("Source: " + sou);
    }

    @Override
    public void destination(String dest) {
        System.out.println("Destination: " + dest);
    }
}
