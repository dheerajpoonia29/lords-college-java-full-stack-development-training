package org.example.module_2_fundamentals.assignment;

/*
Task 1

1.⁠ ⁠Create package assignment
2.⁠ ⁠⁠Create a file SimpleStudentApp.java in the path “src/main/java/org/example/”
2.⁠ ⁠⁠Read from the user using Scanner: name (String), age (int), height in meters (double), weight in kilograms (float), and GPA (double).
3.⁠ ⁠Compute BMI as weight / (height * height) and print it
4.⁠ ⁠Determine BMI category using simple if / else if / else (underweight, normal, overweight, obese) and print it.
5.⁠ ⁠⁠Print whether the student is a minor or adult using a relational operator (age < 18).
6.⁠ ⁠⁠Use a ternary operator once to print Pass if gpa >= 2.5 else Fail.
7.⁠ ⁠⁠Close the Scanner properly.

Sample input:-
Enter your name name: Alice
Enter your age: 20
Enter your height: 1.68
Enter your weight: 60
Enter your gpa: 3.0

Sample output:-
Your name is Alice
Your BMI is 21.26 (Normal)
Your are Adult
Result Pas
 */

import java.util.Scanner;

public class SimpleStudentApp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your name name: ");
        String name = obj.nextLine();

        System.out.println("Enter your age: ");
        int age = obj.nextInt();

        System.out.println("Enter your height: ");
        double height = obj.nextDouble();

        System.out.println("Enter your weight: ");
        float weight = obj.nextFloat();

        System.out.println("Enter your gpa: ");
        double gpa = obj.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);

        if(age<18) {
            System.out.println("You are Minor");
        } else {
            System.out.println("You are Adult");
        }

        String result = gpa >= 2.5 ? "Pass" : "Fail";
        System.out.println("Result " + result);
    }
}
