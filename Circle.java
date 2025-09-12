package com.xworkz.polymorphism;

public class Circle extends Shape{

    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public void calculateArea(double radius) {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}


