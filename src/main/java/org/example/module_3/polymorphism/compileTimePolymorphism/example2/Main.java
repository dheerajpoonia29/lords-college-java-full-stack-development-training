package org.example.module_3.polymorphism.compileTimePolymorphism.example2;

public class Main {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        int a = 10, b = 20;
        System.out.println(myCalc.add(a, b));

        double c = 10, d = 20;
        System.out.println(myCalc.add(c, d));

        float e = 10.0f, f = 20.0f;
        System.out.println(myCalc.add(e, f));
    }
}
