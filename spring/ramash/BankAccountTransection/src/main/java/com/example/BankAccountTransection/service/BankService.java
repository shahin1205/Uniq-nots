package com.example.BankAccountTransection.service;


import com.example.BankAccountTransection.model.Account;
import com.example.BankAccountTransection.model.Transaction;
import com.example.BankAccountTransection.model.TransactionHistory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BankService {

    List<Account> accounts=new ArrayList<>();
    List<Transaction> transactions=new ArrayList<>();
    List<TransactionHistory> transactionHistories=new ArrayList<>();

    public String addAccount(Account account){
        accounts.add(account);
        return "Account successfully added";
    }

    public List<Account> getAccounts(){
        return accounts;
    }

    public String deposit(int accountId,Transaction transaction){
        for (Account account:accounts){
            if (account.getAccountNumber()==accountId){
                transaction.setTransactionDate(LocalDateTime.now());
                account.getTransactions().add(transaction);

                transactions.add(transaction);

                double amount=account.getBalance()+transaction.getAmount();
                account.setBalance(amount);

                //-------------------------------history------------------
//
                transactionHistories.add(new TransactionHistory(accountId,transaction.getTransactionId(),transaction.getType(),transaction.getAmount(),amount));
                return "Deposit successfully";

            }
        }
        return "Account number is not match";
    }

    public String withdraw(int accountId,Transaction transactionss){
        for (Account account:accounts){
            if(account.getAccountNumber()==accountId){
                for (Transaction transaction:account.getTransactions()){
                    if (account.getBalance()>=transactionss.getAmount()) {
                        transaction.setTransactionDate(LocalDateTime.now());
                        transaction.setAmount(transactionss.getAmount());
                        transaction.setType("withdraw");
                        double amount = account.getBalance() - transaction.getAmount();
                        account.setBalance(amount);
                        transactionHistories.add(new TransactionHistory(accountId,transaction.getTransactionId(),transaction.getType(),transaction.getAmount(),amount));

                        return "Withdraw successfully";
                    }
                }
                return "balance not allowed";
            }
        }return "Account number is not match";
    }

    public List<TransactionHistory> history(int accountId){
        List<TransactionHistory> history=new ArrayList<>();
        for (TransactionHistory transactionHistory:transactionHistories){
            if (transactionHistory.getAccountID()==accountId){
                 history.add(transactionHistory);
            }
        }
        return history;
    }

}
