package org.example.module_7_multithreading;

public class YeildExample extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName());
//            Thread.yield();
        }
    }

    public static void main(String[] args) {
        new YeildExample().start();
        new YeildExample().start();
    }
}
