package org.example.module_2.assignment;

import java.util.Scanner;

public class RunningCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        boolean continueCalculation = true;

        do {
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

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String userResponse = obj.next();
            if(userResponse.equals("yes")) {
                continueCalculation = true;
            } else {
                continueCalculation = false;
            }
        } while(continueCalculation==true);
    }
}
