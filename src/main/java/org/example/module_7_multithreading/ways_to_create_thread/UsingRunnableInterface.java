package org.example.module_7_multithreading.ways_to_create_thread;

public class UsingRunnableInterface {

    public static void main(String[] args) {
        Runnable runnableObj = () -> {
            // task
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName() + " i="+i);
            }
        };

        Thread t0 = new Thread(runnableObj);
        Thread t1 = new Thread(runnableObj);

        t0.start();
        t1.start();

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
