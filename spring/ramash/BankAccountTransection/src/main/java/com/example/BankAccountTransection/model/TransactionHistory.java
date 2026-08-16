package com.example.BankAccountTransection.model;

public class TransactionHistory {
    private int accountID;
    private int transactionId;
    private String paymentType;
    private double paymentAmount;
    private double balanceAmount;


    public TransactionHistory() {
    }

    public TransactionHistory(int accountID, int transactionId, String paymentType, double paymentAmount, double balanceAmount) {
        this.accountID = accountID;
        this.transactionId = transactionId;
        this.paymentType = paymentType;
        this.paymentAmount = paymentAmount;
        this.balanceAmount = balanceAmount;
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
}
