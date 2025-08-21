package com.xworkz.inheritance;

public class Horse extends Animal {
    private String color;
    private int speed;

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
}
