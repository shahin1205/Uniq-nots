package com.example.BankAccount.domain;

import java.time.LocalDateTime;
enum PaymentType{
    DEPOSIt,
    TRANSFER,
    WITHDRAW
}

public class History {
    private int accountID;
    private int transactionId;
    private String paymentType;
    private double paymentAmount;
    private double balanceAmount;
    private LocalDateTime date;

    public History() {
    }

    public History(int accountID, int transactionId, String paymentType, double paymentAmount, double balanceAmount, LocalDateTime date) {
        this.accountID = accountID;
        this.transactionId = transactionId;
        this.paymentType = paymentType;
        this.paymentAmount = paymentAmount;
        this.balanceAmount = balanceAmount;
        this.date = date;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
