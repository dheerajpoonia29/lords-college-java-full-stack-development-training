package org.example.module_3.inheritance.example_1;

public class Main {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount();
        obj.deposit(5000);
        obj.printBalance();
        obj.applyInterest();
        obj.printBalance();

        CurrentAccount obj2 = new CurrentAccount();
        obj2.deposit(8000);
        obj2.printBalance();
        obj2.applyInterest();
        obj2.printBalance();
    }
}
