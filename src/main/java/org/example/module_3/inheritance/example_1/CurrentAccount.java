package org.example.module_3.inheritance.example_1;

/*
Parent class : BankAccount
Child class  : CurrentAccount
Child class is inheriting properties and methods of Parent class which is called Inheritance
and we use extends keyword to achieve Inheritance
 */

public class CurrentAccount extends BankAccount {
    public double interestRate = 2.5;

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
    }
}
