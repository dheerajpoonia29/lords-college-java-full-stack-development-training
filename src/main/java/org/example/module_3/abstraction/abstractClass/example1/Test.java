package org.example.module_3.abstraction.abstractClass.example1;

public class Test {
    public static void main(String[] args) {
        // we cannont create object of abstract class
//        MyClass obj = new MyClass();
//        obj.myFunc();

//        UserClass1 obj = new UserClass1();
//        obj.myFunc();
//        obj.myAbstractFunc();

        MyClass obj1 = new UserClass1();
        obj1.myAbstractFunc();
        MyClass obj2 = new UserClass2();
        obj2.myAbstractFunc();
    }
}
