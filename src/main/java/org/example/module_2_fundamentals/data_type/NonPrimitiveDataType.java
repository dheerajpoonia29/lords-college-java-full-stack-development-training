package org.example.module_2_fundamentals.data_type;

public class NonPrimitiveDataType {
    public static void main(String[] args) {
        String name = "Dheeraj";
        System.out.println("Name: " + name);

        int[] array1 = {1,2,4,4,5}; // declaration with initialization
        System.out.println("Array 1st, element at 0th index is :" + array1[0]);

        int[] array2 = new int[5]; // declaration of array with size
        array2[3] = 20;
        System.out.println("Array 2nd, element at 3rd index is:" + array2[3]);

        String[] friends = new String[3];
        friends[0] = "Joy";
        friends[1] = "chanler";
        friends[2] = "Ross";

        Person obj = new Person(); // obj, obj is non primitive data type
        obj.greet();

        enum Day {
            SUNDAY,
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY
        }

        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
    }
}

// class as non primtive data type
class Person {
    String name;
    public void greet() {
        System.out.println("Person says hello!");
    }
}
