package com.xworkz.polymorphism;

public class ShapeRunner {
    public static void main(String[] args) {
        // Upcasting
        Shape shape = new Circle();
        Shape shape1 = new Rectangle();

        // Downcasting
        Circle circle = (Circle) shape;
        circle.calculateArea(5);

        Rectangle r = (Rectangle) shape1;
        r.calculateArea(4,6);
}
}

