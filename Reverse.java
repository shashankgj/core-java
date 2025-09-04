package com.xworkz.program;

public class Reverse {
    public static void main(String[] args) {
        int num = 1234;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}

