package org.example.module_3.polymorphism.compileTimePolymorphism.example2;

public class Calculator {
    public int add(int a, int b) {
        System.out.println("add method with int type parameter called");
        return a+b;
    }

    public double add(double a, double b) {
        System.out.println("add method with double type parameter called");
        return a+b;
    }

    public float add(float a, float b) {
        System.out.println("add method with float type parameter called");
        return a+b;
    }
}
