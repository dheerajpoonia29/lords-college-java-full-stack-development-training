package org.example.module_3.inheritance.example_1;

public class BankAccount {
    // balance is a attribute of class
    public double balance;


    // methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }
}
