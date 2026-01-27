package org.example.module_7_multithreading.wait_notify_example;

public class Main {
    public static void main(String[] args) {
        BankAccount jointAccount = new BankAccount();

        new WithdrawThread(jointAccount, "Person A").start();
        new WithdrawThread(jointAccount, "Person B").start();

        new DepositThread(jointAccount, "Person C", 2000).start();
    }
}
