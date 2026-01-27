package org.example.module_7_multithreading.ways_to_create_thread;

public class UsingRunnableInterface {

    public static void main(String[] args) {
        // assigning lambda function to runnable instance of Runnable Interface
        Runnable runnable = () -> {
            // task
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName() + " i="+i);
            }
        };

        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);

        t0.start();
        t1.start();

        // directly passing a lambda function as argument in Thread constructor
        Thread t3 = new Thread(() -> {
            // task
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName() + " i="+i);
            }
        });
        Thread t4 = new Thread(() -> {
            // task
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName() + " i="+i);
            }
        });
        t3.start();
        t4.start();
    }
}
