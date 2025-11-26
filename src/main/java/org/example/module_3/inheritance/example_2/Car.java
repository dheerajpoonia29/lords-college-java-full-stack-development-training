package org.example.module_3.inheritance.example_2;

// Is - A relationship
// car IS-A vehicle

public class Car extends Vehicle {
    // attributes of Car
    int numberOfDoors;

    void openTrunk() {
        System.out.println(brand + "'s trunk is now open.");
    }
}
