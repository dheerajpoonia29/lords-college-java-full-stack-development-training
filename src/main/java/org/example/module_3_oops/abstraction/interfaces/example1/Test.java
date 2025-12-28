package org.example.module_3_oops.abstraction.interfaces.example1;

public class Test {
    public static void main(String[] args) {
        Remote o1 = new Tv();
        Remote o2 = new Ac();

        doWork(o1);
        doWork(o2);
    }

    public static void doWork(Remote obj){
        obj.turnOn();
        obj.turnOff();
    }
}
