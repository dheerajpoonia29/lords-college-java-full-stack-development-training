package org.example.module_4.exceptionHandling.tryCatchFinally;

import java.util.Scanner;

public class HandleUserInputException {
    public static void main(String[] args) {
        System.out.println("Program started");
        Scanner obj = new Scanner(System.in);

        String[] names = {"Alice", "Bob", "Charlie"};
        boolean run = true;

        do {
            System.out.println("Enter an index to access the names array [0-2]:");

            int index = obj.nextInt();

            try {
                System.out.println("Name at index " + index + ": " + names[index]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid index. Please enter a number between 0 and 2.");
            }

            System.out.println("Do you want to continue? (true/false): ");
            run = obj.nextBoolean();
        } while(run);

        obj.close();
        System.out.println("Program ended");
    }
}
