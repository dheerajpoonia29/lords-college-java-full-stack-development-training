package org.example.module_2_fundamentals.control_flow;

public class WhileExample {
    public static void main(String[] args) {
        System.out.println("While Loop Example:");
        int count = 1;
        // while loop
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println("\nDo-While Loop Example:");
        count = 6;
        do {
            System.out.println("Count in do-while: " + count);
            count++;
        }while (count <= 5);
    }
}
