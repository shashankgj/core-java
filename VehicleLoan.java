package com.xworkz.polymorphism;

public class VehicleLoan extends LoanAccount{
    public void amountdeposit(int amount) {
        System.out.println("Deposited amount to VehicleLoan account"+amount);
    }
    public void amountwithdraw(int amount) {
        System.out.println("Withdrawing amount FROM VehicleLoan account"+amount);
    }
}
