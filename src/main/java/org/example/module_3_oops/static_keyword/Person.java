package org.example.module_3_oops.static_keyword;

public class Person {
    public int age;
    public String name;

    // static variable country, code
    public static String country = "USA";

    Person(int userAge, String userName) {
        this.age = userAge;
        this.name = userName;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // static method display
    public static void display() {
        System.out.println("This is a static method.");
    }

    // static block
    static {
        System.out.println("my static block");
    }

    // static nested class
    static class Address {
        public String city;
        public String state;

        Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        public void displayAddress() {
            System.out.println("City: " + city + ", State: " + state);
        }
    }
}
