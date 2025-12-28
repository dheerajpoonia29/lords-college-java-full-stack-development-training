package org.example.module_3_oops.static_keyword;

public class MyClass {
    public static void main(String[] args) {
        Person p1 = new Person(25, "Alice");
        p1.displayPersonInfo();
        System.out.println(p1.country);

        Person p2 = new Person(30, "Bob");
        p2.displayPersonInfo();
        System.out.println(p2.country);

//        Person.displayPersonInfo(); non static method cannot be called by class name
        Person.display(); // static method can be called by class name
    }
}
