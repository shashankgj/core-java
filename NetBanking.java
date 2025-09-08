package com.xworkz.polymorphism;

    public class NetBanking extends Payment{
        public void makePayment(int amount) {
            System.out.println("Making Payment using Netbanking"+amount);
        }
    }
