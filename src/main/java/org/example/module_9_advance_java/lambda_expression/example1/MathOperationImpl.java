package org.example.module_9_advance_java.lambda_expression.example1;

public class MathOperationImpl {

    static MathOperation additionObj = (a, b) -> a + b;

    static MathOperation subtractionObj = (a, b) -> a - b;

    static MathOperation multiplicationObj = (a, b) -> a * b;

    static MathOperation divisionObj = (a, b) -> a / b;

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + additionObj.operation(a, b));
        System.out.println("Subtraction: " + subtractionObj.operation(a, b));
        System.out.println("Multiplication: " + multiplicationObj.operation(a, b));
        System.out.println("Division: " + divisionObj.operation(a, b));
    }

    // basic function
    public int operation(int a, int b) {
        System.out.println("Performing operation on " + a + " and " + b);
        System.out.println("this is 2nd line of code");
        return a + b;
    }
}
