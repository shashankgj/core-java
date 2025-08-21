package com.xworkz.inheritance;

public class DogRunner
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.setName("golden retriver");
        System.out.println(dog.getName());

        Dog dog1 = new Dog();
        dog1.setName("german shepard");
        System.out.println(dog1.getName());
    }
}
