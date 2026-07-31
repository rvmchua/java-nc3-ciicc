package com.ciicc.interfacestutorial;

public class CarRental {
    Car car;

    public CarRental(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void testDrive() {
        car.drive();
    }

    public void testDrive(Car car) {
        car.drive();
    }

    public void testDrive(Car car, int distance) {
        System.out.println("This is overloading");
    }

}
