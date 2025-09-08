package com.xworkz.polymorphism;

public class PaymentRunner {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.makePayment(10000);
    }
}
