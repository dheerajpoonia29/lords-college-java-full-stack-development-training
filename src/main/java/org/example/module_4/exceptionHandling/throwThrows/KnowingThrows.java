package org.example.module_4.exceptionHandling.throwThrows;

public class KnowingThrows {
    public static void main(String[] args) {
        System.out.println("Program started");
        try {
            myMethod();
        } catch(ArithmeticException e) {
            System.out.println("Exception handled");
        }
        System.out.println("Program ended successfully");
    }

    // throws used to declare the exception
    static void myMethod() throws ArithmeticException {
        int a = 10/2;
    }
}
