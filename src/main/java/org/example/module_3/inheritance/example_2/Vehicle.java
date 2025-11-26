package org.example.module_3.inheritance.example_2;

public class Vehicle {
    // attributes of Vehicle
    String brand;
    int speed;

    // method of Vehicle
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    void start() {
        System.out.println(brand + " is starting.");
    }

    void stop() {
        System.out.println(brand + " is stopping.");
    }
}
