package com.xworkz.inheritance;



public class CatRunner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Persian Cat");
        cat.setBreed("Persian");
        cat.setEyeColor("Blue");

        System.out.println(cat.getName());
        System.out.println(cat.getBreed());
        System.out.println(cat.getEyeColor());
    }
}
