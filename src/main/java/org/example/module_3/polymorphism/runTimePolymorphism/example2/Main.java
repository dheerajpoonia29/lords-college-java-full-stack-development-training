package org.example.module_3.polymorphism.runTimePolymorphism.example2;

public class Main {
    public static void main(String[] args) {
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();

        obj1.makeSound();
        obj2.makeSound();
    }
}
