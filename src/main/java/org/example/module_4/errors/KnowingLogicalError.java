package org.example.module_4.errors;

// Program will compiled
// Program will run
// Program give incorrect result due to logical error

public class KnowingLogicalError {
    public static void main(String[] args) {
        System.out.println(add(20, 5));
    }

    public static int add(int a, int b) {
        return a-b;
    }
}
