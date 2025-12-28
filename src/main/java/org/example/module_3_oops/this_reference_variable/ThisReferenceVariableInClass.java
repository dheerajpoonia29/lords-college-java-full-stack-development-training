package org.example.module_3_oops.this_reference_variable;

public class ThisReferenceVariableInClass {
    // age is global variable, part of object, instance variable
    int age;

    void printAge() {
        // local variable, variable method level
        int age = 30;
        System.out.println("Age is: "+ age);
        System.out.println("Age is: "+ this.age);
    }

    public static void main(String[] args) {
        ThisReferenceVariableInClass obj = new ThisReferenceVariableInClass();
        obj.age = 20;
        obj.printAge();

        ThisReferenceVariableInClass obj2 = new ThisReferenceVariableInClass();
        obj2.age = 60;
        obj2.printAge();
    }
}
