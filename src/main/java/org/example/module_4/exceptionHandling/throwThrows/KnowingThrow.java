package org.example.module_4.exceptionHandling.throwThrows;

import java.util.Scanner;

public class KnowingThrow {
    public static void main(String[] args) {
        System.out.println("Program started");

        try {
            // handling explicitly thrown exception
            takeUserInputAndValidate();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program ended");
    }

    public static void takeUserInputAndValidate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if(age<18) {
            // we are explicitly throwing an exception
            throw new IllegalArgumentException("User is minor");
        } else if(age > 30 && age <60 ) {
            System.out.println("User is young");
        } else {
            System.out.println("User is senior citizen");
        }

        scanner.close();
    }
}
