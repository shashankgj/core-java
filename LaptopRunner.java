package com.xworkz.polymorphism;


public class LaptopRunner {
    public static void main(String[] args) {

        Laptop laptop;

        laptop = new Dell();
        System.out.println("Dell Price for 2 units: " + laptop.calculatePrice(2));

        laptop = new Hp();
        System.out.println("HP Price for 3 units: " + laptop.calculatePrice(3));

        laptop = new Lenovo(); 
        System.out.println("Lenovo Price for 1 unit: " + laptop.calculatePrice(1));
    }
}
