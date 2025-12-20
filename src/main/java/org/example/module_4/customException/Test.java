package org.example.module_4.customException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Program started");

        try {
            takeUserInputAndValidate();
        } catch(MyException e) {
            System.out.println("My custom exception thrown handled msg: " + e.getMessage());
        }

        System.out.println("Program ended");
    }

    public static void takeUserInputAndValidate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if(age<18) {
            // we are explicitly throwing an exception
            throw new MyException("User is minor");
        } else if(age > 30 && age <60 ) {
            System.out.println("User is young");
        } else {
            System.out.println("User is senior citizen");
        }

        scanner.close();
    }
}
