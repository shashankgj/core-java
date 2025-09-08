package com.xworkz.polymorphism;

public class LoanAccountRunner {
    public static void main(String[] args) {
        HouseLoan houseLoan = new HouseLoan();
        houseLoan.amountwithdraw(500000);
        houseLoan.amountdeposit(100000);

        VehicleLoan vehicleLoan = new VehicleLoan();
        vehicleLoan.amountwithdraw(300000);
        vehicleLoan.amountdeposit(230000);
    }
}
