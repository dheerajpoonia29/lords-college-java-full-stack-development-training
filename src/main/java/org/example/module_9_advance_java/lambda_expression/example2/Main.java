package org.example.module_9_advance_java.lambda_expression.example2;

public class Main {
    //obj1 is an object of functional interface Greeting the object will declare with lambda expression
    static Greeting obj1 = (a) -> System.out.println("good morning " + a);

    public static void main(String[] args) {
        obj1.greet("john");
        obj1.greet("michael");
        obj1.greet("susan");
    }
}
