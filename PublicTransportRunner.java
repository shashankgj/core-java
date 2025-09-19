package com.xworkz.abstraction;

public class PublicTransportRunner {
    public static void main(String[] args) {

        Metro metro = new PublicTransport();
        metro.speed(100);
        metro.source("Rajajinagar");
        metro.destination("MG Road");

        Bmtc bmtc = new PublicTransport();
        bmtc.source("Majestic");
        bmtc.destination("Electronic City");
    }
}
