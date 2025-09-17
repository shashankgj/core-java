package com.xworkz.abstraction;

public class AnimalRunner {
    public static void main(String[] args)
    {
        Animal animal = new DomasticAnimals();
        animal.Behaviour();

        Animal animal1 = new WildAnimals();
        animal1.Behaviour();
    }
}
