package org.example.module_4.exceptionHandling.tryCatchFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Program started");
        try {
            FileInputStream file = new FileInputStream("java/org/example/module_4/exceptionHandling/abc.txt");
            System.out.println(file);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception occurred: " + e.getMessage());
        }
        System.out.println("Program ended");
    }
}
