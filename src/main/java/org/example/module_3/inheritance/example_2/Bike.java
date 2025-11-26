package org.example.module_3.inheritance.example_2;

// Bike IS-A Vehicle

public class Bike extends Vehicle {
    // attributes of Bike
    boolean hasCarrier;

    // method of Bike
    void doWheelie() {
        System.out.println(brand + " is doing a wheelie!");
    }
}
