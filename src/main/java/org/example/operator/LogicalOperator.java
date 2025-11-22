package org.example.operator;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;

        // Logical AND operator (&&)
        /*
        true true = true
        true false = false
        false false = false
         */
        System.out.println("x && y: " + (x && y));

        // Logical OR operator (||)
        /*
        true ture = ture
        true false = true
        false false = false
         */
        System.out.println("x || y: " + (x || y));

        // Logical NOT operator (!)
        /*
        true -> false
        false -> true
         */
        System.out.println("!x: " + (!x));
    }
}
