package org.example.module_7_multithreading.inter_thread_communication.assignment;

public class Order {
    private boolean foodReady = false;


    public synchronized void waitForOrder() throws InterruptedException {
        // this function consumed/called by waiter thread
        // call wait() function
        while(foodReady == false) {
            wait();
        }

        System.out.println("Waiter served the food");
    }

    public synchronized void placeOrder() {
        // this function called by customer thread
        System.out.println("Customer placed order");
    }

    public synchronized void cookOrder() {
        // this function called by chef thread
        // call notify() function
        System.out.println("chef cooked food");
        foodReady = true;
        notify();
    }
}
