package com.xworkz.polymorphism;

public class Rectangle extends Shape {

    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    public void calculateArea(double length, double breadth) {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}


