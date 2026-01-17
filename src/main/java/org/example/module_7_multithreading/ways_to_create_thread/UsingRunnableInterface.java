package org.example.module_7_multithreading.ways_to_create_thread;

public class UsingRunnableInterface {
    public static void main(String[] args) {
        Runnable task = new MyTask();   // step 1: create Runnable
        Thread thread = new Thread(task); // step 2: pass Runnable to Thread
        thread.start();                  // step 3: start thread

        Runnable task1 = () -> {
            System.out.println("Thread running using lambda");
        };

        Thread thread2 = new Thread(task);
        thread2.start();

        Thread t = new Thread(() -> {
            System.out.println("Running thread");
        });
        t.start();
    }
}
class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable");
    }
}
