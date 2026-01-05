package org.example.module_5_collections_map_generic.generic_programming.questions;

public class Question3 {
    public static void main(String[] args) {
        Box<Integer> obj1 = new Box<>();
        obj1.setValue(10);
        System.out.println("Integer Value: " + obj1.getValue());

        Box<String> obj2 = new Box<>();
        obj2.setValue("Hello");
        System.out.println("String Value: " + obj2.getValue());
    }
}

// create generic Box class with setValue and getValue methods
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

