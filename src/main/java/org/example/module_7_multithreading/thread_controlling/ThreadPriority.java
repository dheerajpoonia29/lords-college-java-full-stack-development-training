package org.example.module_7_multithreading.thread_controlling;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
            for(int i=1; i<=5; i++) {
                System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority() + " Data: "+ i);
                Thread.yield();
            }
        });

        Thread t2 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
            for(int i=1; i<=5; i++) {
                System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority() + " Data: "+ i);
                Thread.yield();
            }
        });

        Thread t3 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
            for(int i=1; i<=5; i++) {
                System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority() + " Data: "+ i);
                Thread.yield();
            }
        });

        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
