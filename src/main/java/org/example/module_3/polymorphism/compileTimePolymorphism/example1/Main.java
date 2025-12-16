package org.example.module_3.polymorphism.compileTimePolymorphism.example1;

public class Main {
    public static void main(String[] args) {
        MyClass o1 = new MyClass();
        o1.myFunc();
        o1.myFunc(10);
        o1.myFunc(10, 20);
    }
}
