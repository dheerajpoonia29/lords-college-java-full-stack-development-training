package org.example.module_7_multithreading.ways_to_create_thread;

public class UsingRunnableInterface {

    public static void main(String[] args) {
        Runnable task1 = () -> {
            // task 1
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName() + " i="+i);
            }
        };

        Runnable task2 = () -> {
            // task 2
            for(int i=1; i<=10; i++){
                System.out.println(Thread.currentThread().getName() + " i="+i);
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        Thread t3 = new Thread(() -> {
            // task
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName() + " i="+i);
            }
        });
        Thread t4 = new Thread(() -> {
            // task
            for(int i=1; i<=10; i++){
                System.out.println(Thread.currentThread().getName() + " i="+i);
            }
        });
        t3.start();
        t4.start();
    }
}
