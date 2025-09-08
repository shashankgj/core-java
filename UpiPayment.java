package com.xworkz.polymorphism;


    public class UpiPayment extends Payment{
        public void makePayment(int amount) {
            System.out.println("Making Payment using Upi"+amount);
        }
    }
