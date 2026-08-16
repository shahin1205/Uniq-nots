package com.example.BankAccount.domain;

import java.time.LocalDateTime;

public class Transection {
    private int transectionID;
    private double amount;
    private String Type;
    private double balance ;


    public Transection() {
    }

//    public Transection(int transectionID, double amount, String type, double balance) {
//        this.transectionID = transectionID;
//        this.amount = amount;
//        Type = type;
//        this.balance = balance;
//    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTransectionID() {
        return transectionID;
    }

    public void setTransectionID(int transectionID) {
        this.transectionID = transectionID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
