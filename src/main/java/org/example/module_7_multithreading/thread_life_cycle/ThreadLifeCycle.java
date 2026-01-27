package org.example.module_7_multithreading.thread_life_cycle;

public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(
            // run() function as lambda expression
            () -> {
                System.out.println(Thread.currentThread().getState());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        );
        System.out.println(t1.getState()); // NEW
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE
        Thread.sleep(500);
        System.out.println(t1.getState()); // TIMED_WAITING
        t1.join();
        System.out.println(t1.getState()); // TERMINATED DEAD
    }
}
