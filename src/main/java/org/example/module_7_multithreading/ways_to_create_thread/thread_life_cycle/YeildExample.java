package org.example.module_7_multithreading.ways_to_create_thread.thread_life_cycle;

public class YeildExample {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getState());
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        });

        System.out.println(t.getState()); // NEW
        t.start();
        System.out.println(t.getState()); // RUNNABLE
        Thread.sleep(500);
        System.out.println(t.getState()); // TIMED_WAITING
        t.join();
        System.out.println(t.getState()); // TERMINATED
    }
}
