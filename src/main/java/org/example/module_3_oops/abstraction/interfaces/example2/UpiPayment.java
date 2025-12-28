package org.example.module_3_oops.abstraction.interfaces.example2;

public class UpiPayment extends Bank implements PaymentSystemInterface {
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
