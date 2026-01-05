package org.example.module_5_collections_map_generic.generic_programming.generic_method;

public class MyClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method1("Hello, World!");
        myClass.method1(42);
        myClass.method1(3.14);

        String result1 = myClass.method2("Generic Method");
        Integer result2 = myClass.method2(100);
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);

        System.out.println(myClass.method3("First Parameter", 200));
        System.out.println(myClass.method3(2.14, "Second Parameter"));
    }

    // Generic method that accepts a parameter of any type
    public <T> void method1(T parameter) {
        System.out.println("Parameter value: " + parameter);
    }

    // Generic method that returns a value of the same type as the parameter
    public <T> T method2(T parameter) {
        return parameter;
    }

    // Generic method with multiple type parameters
    public <T, Z> T method3(T param1, Z param2) {
        return param1;
    }
}
