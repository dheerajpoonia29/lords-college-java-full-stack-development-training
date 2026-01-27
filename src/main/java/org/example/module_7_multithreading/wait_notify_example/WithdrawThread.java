package org.example.module_7_multithreading.wait_notify_example;

class WithdrawThread extends Thread {
    private BankAccount account;
    private String person;

    WithdrawThread(BankAccount account, String person) {
        this.account = account;
        this.person = person;
    }

    public void run() {
        try {
            account.withdraw(person, 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
