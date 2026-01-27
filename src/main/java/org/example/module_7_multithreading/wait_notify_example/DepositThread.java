package org.example.module_7_multithreading.wait_notify_example;

public class DepositThread extends Thread {
    private BankAccount account;
    private String person;
    private Integer amount;

    DepositThread(BankAccount account, String person, Integer amount) {
        this.account = account;
        this.person = person;
        this.amount = amount;
    }

    public void run() {
        try {
            Thread.sleep(2000); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.deposit(person, amount);
    }
}
