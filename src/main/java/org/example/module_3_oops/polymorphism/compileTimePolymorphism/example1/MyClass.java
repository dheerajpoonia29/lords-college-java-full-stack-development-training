package org.example.module_3_oops.polymorphism.compileTimePolymorphism.example1;

public class MyClass {
    // method overloading

    public void myFunc() {
        System.out.println("myFunc with no argument called");
    }
    
    public void myFunc(int a) {
        System.out.println("myFunc with 1 argument called");
    }

    public void myFunc(int a, int b) {
        System.out.println("myFunc with 2 argument called");
    }
}
