package com.example.BankAccount.service;

import com.example.BankAccount.domain.Account;
import com.example.BankAccount.domain.History;
import com.example.BankAccount.domain.Transection;

import java.util.List;

public interface ServiceInterface {

    Account getAccount(int accountId);
    String deposit(int accountId, Transection transection);
    String withdraw(int accountId, Transection transection);
    List<History> histories(int accountId);
    String transection(int fromAccount, int toAccount,Transection transection);
}
