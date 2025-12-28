package org.example.module_2_fundamentals.control_flow;

public class ForExample {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Length of array number: " + numbers.length);
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }

        String[] fruits = {"Apple", "Banana", "Cherry"};
        for(int i=0; i<fruits.length; i++) {
            System.out.println("Fruit: " + fruits[i]);
        }

        for(String fruit : fruits) {
            System.out.println("Fruit (enhanced for): " + fruit);
        }
    }
}
