package com.xworkz.abstraction;

public class GadgetsRunner {
    public static void main(String[] args)
    {
        Gadgets gadgets = new Telivision();
        gadgets.Features();

        Gadgets gadgets1 = new Laptop();
        gadgets1.Features();
    }
}
