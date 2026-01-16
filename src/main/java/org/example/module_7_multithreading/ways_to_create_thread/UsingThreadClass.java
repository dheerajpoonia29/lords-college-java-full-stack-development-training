package org.example.module_7_multithreading.ways_to_create_thread;

public class UsingThreadClass {
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        obj.start();

        Thread2 obj2 = new Thread2();
        obj2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("thread is started");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("thread 2 is started");
    }
}
