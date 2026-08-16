package com.example.BankAccount.domain;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;
    private List<History> history;

    public Account() {
    }

    public Account(int accountNumber, String holderName, double balance, List<History> history) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

        this.history = history;
    }

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
//        this.history=new ArrayList<>();
    }





    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }
}
