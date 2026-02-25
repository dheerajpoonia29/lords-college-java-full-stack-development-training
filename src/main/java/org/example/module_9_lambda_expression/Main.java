package org.example.module_9_lambda_expression;

public class Main {
    static MathOperation addition = (int a, int b) -> a + b;

    //with out type declaration
    static MathOperation subtraction = (a, b) -> a - b;

    //with return statement along with curly braces
    MathOperation multiplication = (int a, int b) -> { return a * b; };

    //without return statement and without curly braces
    MathOperation division = (int a, int b) -> a / b;

    public static void main(String[] args) {
        System.out.println("10 + 5 = " + addition.operation(5,10));

        //without parenthesis
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }


    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}

interface MathOperation {
    int operation(int a, int b);
}

interface GreetingService {
    void sayMessage(String message);
}
