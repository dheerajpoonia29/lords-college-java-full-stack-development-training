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
class Customer extends Thread {
    private Order order;

    Customer(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        order.placeOrder();
    }
}

// Waiter thread
class Waiter extends Thread {
    private Order order;

    Waiter(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        try {
            order.waitForOrder();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

// Chef thread
class Chef extends Thread {
    private Order order;

    Chef(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        try {
            System.out.println("chef is cooking food");
            Thread.sleep(10000); // simulating cooking time
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        order.cookOrder();
    }
}