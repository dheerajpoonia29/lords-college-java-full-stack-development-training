package org.example.module_3_oops.constructor;

class Person {
    String name;
    int age;

    // constructor method
    Person() {
        System.out.println("Constructor called");
    }

    // constructor with parameters (parameterized constructor)
    Person(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    void printPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
