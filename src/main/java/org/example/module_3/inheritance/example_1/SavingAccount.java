package org.example.module_3.inheritance.example_1;

public class SavingAccount extends BankAccount {
    // attributes
    public double interestRate = 4.5;

    // methods
    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
    }
}
