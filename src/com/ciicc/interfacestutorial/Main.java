package com.ciicc.interfacestutorial;

public class Main {
    public static void main(String[] args) {
//        instatiation area
        Car ford = new Ford();
        Car toyota = new Toyota();
        Car byd = new Byd();

//        constructor injection
        CarRental carRental = new CarRental(byd); // constructor nag-inject

//        Setter injection
        carRental.setCar(ford); // Setter nag-inject
        carRental.testDrive();

//        Regular Method injection
        carRental.testDrive(toyota); // Method nag-inject

//        Method overloading
        carRental.testDrive(byd, 50);
    }
}
