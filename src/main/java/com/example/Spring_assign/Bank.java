package com.example.Spring_assign;

public class Bank {
    private int bankId;
    private String bankName;

    public Bank(int bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "BankId: " + bankId + ", BankName: " + bankName;
    }
}
