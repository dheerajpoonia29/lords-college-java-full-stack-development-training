package org.example.module_3.abstraction.abstractClass.example2;

public class Test {
    public static void main(String[] args) {
        Remote o1 = new Ac();
        Remote o2 = new Tv();

        doWork(o1);
        doWork(o2);
    }

    public static void doWork(Remote obj) {
        obj.turnOn();
        obj.turnOff();
        obj.myFunc();
    }
}
