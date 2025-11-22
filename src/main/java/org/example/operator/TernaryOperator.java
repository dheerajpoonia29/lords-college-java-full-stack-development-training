package org.example.operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        String result = "";

        // ternary operator
        result = a > b ? "a is greater then b" : "b is greater then a";

        // alternative with if else block
//        if(a>b) {
//            result = "a is greater then b";
//        } else {
//            result = "b is greater then a";
//        }

        System.out.println(result);
    }
}
