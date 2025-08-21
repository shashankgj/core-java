package com.xworkz.inheritance;



public class Cat extends Animal {
    private String breed;
    private String eyeColor;

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getEyeColor() {
        return eyeColor;
    }
}
