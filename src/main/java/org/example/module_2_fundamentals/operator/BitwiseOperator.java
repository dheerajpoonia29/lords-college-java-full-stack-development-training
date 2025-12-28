package org.example.module_2_fundamentals.operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Bitwise AND operator (&)
        /*
        Bitwise and return 1 if both bits are 1 else return 0
        5 & 3 = 1
        5 => 0101
        3 => 0011
        ------------
          => 0001
         */
        System.out.println("a & b: " + (a & b));

        // Bitwise OR operator (|)
        /*
        Bitwise or return 1 if any of the bits is 1 else return 0
        5 | 3 = 7
        5 => 0101
        3 => 0011
        ------------
          => 0111
         */
        System.out.println("a | b: " + (a | b));

        // Bitwise XOR operator (^)
        /*
        Bitwise xor return 1 if both bits are different else return 0
        5 ^ 3 = 6
        5 => 0101
        3 => 0011
        ------------
          => 0110
         */
        System.out.println("a ^ b: " + (a ^ b));

        // Bitwise NOT operator (~)
        /*
        Bitwise not invert all bits
        ~5 = -6
        5  =>  0000 0101
        -------------------
        ~5 =>  1111 1010  (inverted bits)
         */
        System.out.println("~a: " + (~a));

        // Bitwise Left Shift operator (<<)
        /*
        Left shift operator shifts all bits to left by specified number of positions

        5 << 1 = 10
        5  =>  0000 0101
        0101 << 1 -> 1010 -> 10
         */
        System.out.println("a << 1: " + (a << 1));


        // Bitwise right shift operator (>>
        /*
        Right shift operator shifts all bits to right by specified number of positions
         */
        System.out.println("a >> 1: " + (a >> 1));
    }
}
