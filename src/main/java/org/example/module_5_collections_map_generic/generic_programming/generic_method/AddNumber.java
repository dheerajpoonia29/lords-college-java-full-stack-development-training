package org.example.module_5_collections_map_generic.generic_programming.generic_method;

public class AddNumber {
    public static void main(String[] args) {
        // 2+2, 2.2+2.2, 2+2.2

        AddNumber addNumber = new AddNumber();

        Integer i1 = 2, i2 = 4;
        addNumber.add(i1, i2);

        Float f1 = 2.2f, f2 = 4.4f;
        addNumber.add(f1, f2);

        Double d1 = 2.2, d2 = 4.4;
        addNumber.add(d1, d2);

        String s1 = "2", s2 = "4";
//         addNumber.add(s1, s2); // Compilation Error

    }

    public <A extends Number, B extends Number> void add(A a, B b) {
        Double c = a.doubleValue() + b.doubleValue();
        System.out.println("a+b = " + c);
//        System.out.println(a+b);
    }
}
