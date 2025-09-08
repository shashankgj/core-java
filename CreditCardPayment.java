package com.xworkz.polymorphism;

    public class CreditCardPayment extends Payment {
        public void makePayment(int amount) {
            System.out.println("Making Payment using credit card"+amount);
        }
    }
