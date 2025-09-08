package com.xworkz.polymorphism;

public class LoanRunner {

        public static void main(String[] args) {
            Loan loan = new Loan();
            double interest = loan.calculateInterest(1000d, 2.5);
            System.out.println("interest for 1 year " + interest);
            double interest1 = loan.calculateInterest(3000d, 2.5, 3);
            System.out.println("interest for 3 years " + interest1);
        }

}
