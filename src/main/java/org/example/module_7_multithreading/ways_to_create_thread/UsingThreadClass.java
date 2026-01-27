package org.example.module_7_multithreading.ways_to_create_thread;

public class UsingThreadClass {
    public static void main(String[] args) {
        MyThread t0 = new MyThread();
        MyThread t1 = new MyThread();

        t0.start();
        t1.start();
    }
}

class MyThread extends Thread {
    public void run() {
        // task
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " i="+i);
        }
    }
}