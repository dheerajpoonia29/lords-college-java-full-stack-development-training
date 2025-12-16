package org.example.module_3.polymorphism.runTimePolymorphism.example2;

// dog has a animal (wrong)
// a dog is a animal (right)

public class Dog extends Animal {
    public void makeSound() {
        System.out.println("dog barks");
    }
}
