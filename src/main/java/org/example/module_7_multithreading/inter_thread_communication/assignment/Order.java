package org.example.module_7_multithreading.inter_thread_communication.assignment;

public class Order {
    private boolean foodReady = false;


    public synchronized void waitForOrder() {
        // call wait() function
    }

    public synchronized void prepareOrder() {
        // call notify() function
    }
}
