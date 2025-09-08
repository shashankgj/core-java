package com.xworkz.polymorphism;

public class HouseLoan extends LoanAccount{
    public void amountdeposit(int amount)
    {
        System.out.println("Deposited amount to HouseLoan account"+amount);
    }

    public  void amountwithdraw(int amount)
    {
        System.out.println("Withdrawing amount from HouseLoan account  "+amount);
    }
}
