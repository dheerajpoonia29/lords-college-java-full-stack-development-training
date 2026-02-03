package org.example.module_7_multithreading.ways_to_create_thread;

public class UsingThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        // task 1
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " i="+i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        // task 2
        for(int i=1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() + " i="+i);
        }
    }
}