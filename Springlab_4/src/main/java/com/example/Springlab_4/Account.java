package com.example.Springlab_4;

public class Account {
    private String number;
    private String holder;
    private double balance;
    private String type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + number);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + balance);
        System.out.println("Type: " + type);
    }
}
