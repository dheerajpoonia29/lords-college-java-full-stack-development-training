package org.example.module_3.inheritance.example_2;

public class Main {
    public static void main(String[] args) {
        // Create object of Car
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 120;
        myCar.numberOfDoors = 4;

        myCar.start();
        myCar.displayInfo();
        myCar.openTrunk();
        myCar.stop();

        System.out.println();

        // Create object of Bike
        Bike myBike = new Bike();
        myBike.brand = "Yamaha";
        myBike.speed = 80;
        myBike.hasCarrier = true;

        myBike.start();
        myBike.displayInfo();
        myBike.doWheelie();
        myBike.stop();
    }
}
