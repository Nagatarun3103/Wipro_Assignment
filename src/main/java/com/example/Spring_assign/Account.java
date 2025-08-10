package com.example.Spring_assign;


public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private Bank bank;

    public Account(int accountNumber, String accountHolderName, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.bank = bank;
    }

    public void displayDetails() {
        System.out.println("AccountNumber: " + accountNumber);
        System.out.println("AccountHolderName: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Details: " + bank);
    }
}
