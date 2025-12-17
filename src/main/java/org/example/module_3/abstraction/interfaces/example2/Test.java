package org.example.module_3.abstraction.interfaces.example2;

public class Test {
    public static void main(String[] args) {
        PaymentSystemInterface o1 = new CreditCardPayment();
        o1.deposit(200);
        PaymentSystemInterface o2 = new UpiPayment();
        o2.pay(30);

        o1.showBalance();
        o2.showBalance();
    }
}
