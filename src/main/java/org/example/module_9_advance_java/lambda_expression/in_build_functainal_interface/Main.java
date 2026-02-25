package org.example.module_9_advance_java.lambda_expression.in_build_functainal_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> obj1 = (age) -> age >18 ? true : false;
        System.out.println("age 20 is valid for voting: " + obj1.test(20)); // true
        System.out.println("age 15 is valid for voting: " + obj1.test(15)); // false

        Function<String, Integer> obj2 = (str) -> str.length();
        System.out.println("Length of 'Hello': " + obj2.apply("Hello")); // 5

        Consumer<String> obj3 = (message) -> System.out.println("Message: " + message);
        obj3.accept("Hello, World!"); // Message: Hello, World!

        Supplier<Double> obj4 = () -> Math.random();
        System.out.println("Random number: " + obj4.get()); // Random number between
    }
}
