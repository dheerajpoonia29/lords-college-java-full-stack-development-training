package org.example.module_2.assignment;

/*
********Choose Menu*******
* 1. Addition
* 2. Subtraction
* 3. Multiplication
* 4. Division
* Enter your choice:
* Enter your first number:
* Enter your second number:
* Result: <result>
 */

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("********Choose Menu*******");
        System.out.println("Choose your operation: +, -, *, /");
        String userChoice = obj.next();
        System.out.println("Enter your first number:");
        int firstNumber = obj.nextInt();
        System.out.println("Enter your second number:");
        int secondNumber = obj.nextInt();

        int result = 0; // int is 0 by default
        switch (userChoice) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if(secondNumber == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    break;
                }
                System.out.println("Performing integer division.");
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operation selected.");
        }
        System.out.println("Result: " + result);
    }
}
