package org.example.module_2_fundamentals.handleInput;

import java.util.Scanner;

public class UseOfScannerClass {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // String input
        System.out.println("Enter your name: ");
        String name = obj.nextLine();
        System.out.println("Your name is " + name);

        // Integer input
        System.out.println("Enter your age: ");
        int age = obj.nextInt();
        System.out.println("Your age is " + age);

        // Double input
        System.out.println("Enter your height in meters: ");
        double height = obj.nextDouble();
        System.out.println("Your height is " + height + " meters");

        // Float input
        System.out.println("Enter your weight in kilograms: ");
        float weight = obj.nextFloat();
        System.out.println("Your weight is " + weight + " kilograms");

        // Boolean input
        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = obj.nextBoolean();
        System.out.println("Student status: " + isStudent);
    }
}
