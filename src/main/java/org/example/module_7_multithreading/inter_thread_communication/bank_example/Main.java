package org.example.module_7_multithreading.inter_thread_communication.bank_example;

public class Main {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();

        Thread1 t1 = new Thread1(sharedAccount, "Person A", 1000); // person a want to withdraw 1000, wait()
        Thread2 t2 = new Thread2(sharedAccount, "Person B", 2000); // person b is depositing 2000, notify()

        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread {
    BankAccount obj;
    String name;
    int amount;

    Thread1(BankAccount arg, String name, int amount) {
        this.obj = arg;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            obj.withdraw(name, amount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread2 extends Thread {
    BankAccount obj;
    String name;
    int amount;

    Thread2(BankAccount arg, String name, int amount) {
        this.obj = arg;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        obj.deposit(name, amount);
    }
}
