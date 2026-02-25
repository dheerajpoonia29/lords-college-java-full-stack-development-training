package org.example.module_9_advance_java.lambda_expression;

public class LearningLambdaExpression {

    static MathOperation addition = (a, b) -> a + b;

    static MathOperation subtraction = (a, b) -> a - b;

    static MathOperation multiplication = (a, b) -> a * b;

    static MathOperation division = (a, b) -> a / b;

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + addition.operation(a, b));
        System.out.println("Subtraction: " + subtraction.operation(a, b));
        System.out.println("Multiplication: " + multiplication.operation(a, b));
        System.out.println("Division: " + division.operation(a, b));
    }

    // basic function
    public int operation(int a, int b) {
        System.out.println("Performing operation on " + a + " and " + b);
        System.out.println("this is 2nd line of code");
        return a + b;
    }
}
