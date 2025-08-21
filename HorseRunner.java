package com.xworkz.inheritance;


public class HorseRunner {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.setName("Arabian Horse");
        horse.setColor("Brown");
        horse.setSpeed(60);

        System.out.println(horse.getName());
        System.out.println(horse.getColor());
        System.out.println(horse.getSpeed());
    }
}
