package org.example.module_3_oops.inheritance.example_3;

// a laptop is a keyboard (wrong)
// a laptop has a keyboard (right)
// this include that laptop class never inherit keyboard class


public class Laptop {
    String brandName;
    String color;
    int ramSize;
    Keyboard myAcerKeyboard = new Keyboard();

    void startLaptop() {

    }

    void stopLaptop() {

    }
}
