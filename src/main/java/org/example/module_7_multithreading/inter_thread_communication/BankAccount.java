package org.example.module_7_multithreading.inter_thread_communication;

public class BankAccount {
    public int balance;

    // withdraw function is accessing by thread 1
    public synchronized void withdraw(String name, int amount) throws InterruptedException {
        System.out.println(name + " wants to withdraw " + amount + "₹");

        while(balance < amount) {
            System.out.println(name + " waiting due to insufficient balance");
            wait();
        }

        balance -= amount;
        System.out.println(name + " withdrawal of " + amount +"₹ is successful. Balance left: " + balance + "₹");
    }

    // deposit function is accessing by thread 2
    public synchronized void deposit(String name, int amount) {
        System.out.println(name + " depositing ₹ " + amount);
        balance += amount;
        notify();
        System.out.println("after deposit balance " + balance  +"₹");
    }
}
