package org.example.module_7_multithreading.inter_thread_communication.assignment;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(); // shared resource

        Customer customerThread = new Customer(order); // customer place order
        Waiter waiterThread = new Waiter(order); // waiter take order
        Chef chefThread = new Chef(order); // chef prepare order

        customerThread.start();
        waiterThread.start();
        chefThread.start();
    }
}

// Customer thread


// Waiter thread


// Chef thread