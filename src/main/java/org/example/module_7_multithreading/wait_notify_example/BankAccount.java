package org.example.module_7_multithreading.wait_notify_example;

class BankAccount {
    private int balance = 0;

    public synchronized void withdraw(String name, int amount) throws InterruptedException {
        System.out.println(name + " wants to withdraw ₹" + amount);

        while (balance < amount) {
            System.out.println(name + " waiting due to insufficient balance");
            wait();
        }

        balance -= amount;
        System.out.println(name + " withdrawal of " + amount + "₹ is successful. Balance left: ₹" + balance);
    }

    public synchronized void deposit(String name, int amount) {
        System.out.println(name + " depositing ₹" + amount);
        balance += amount;

        notifyAll(); // wake up ALL waiting threads
//        notify(); // wake up ALL waiting threads
    }
}