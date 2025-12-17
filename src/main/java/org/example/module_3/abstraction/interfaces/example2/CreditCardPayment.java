package org.example.module_3.abstraction.interfaces.example2;

public class CreditCardPayment extends Bank implements PaymentSystemInterface {
    public void pay(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void showBalance() {
        System.out.println("Balance : "+balance);
    }
}
