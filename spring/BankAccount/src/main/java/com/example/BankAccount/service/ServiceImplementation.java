package com.example.BankAccount.service;

import com.example.BankAccount.domain.Account;
import com.example.BankAccount.domain.History;
import com.example.BankAccount.domain.Transection;
import com.example.BankAccount.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImplementation implements ServiceInterface {
    @Autowired
    BankRepository bankRepository;

 ////----------------find user by id-------------------------
    @Override
    public Account getAccount(int accountId) {
        return bankRepository.findById(accountId);
    }

    static int transectionCount=0;

    ////-------------deposit--------------------------------
    @Override
    public String deposit(int accountId, Transection transection) {
        Account account=bankRepository.findById(accountId);
        if (account==null){
            return "Id not fond";
        }

        account.setBalance(account.getBalance()+transection.getAmount());
        //-------------------------------------------------

        ///--------------------------------
        History history=new History();
        history.setAccountID(accountId);
        history.setTransactionId(++transectionCount);
        history.setPaymentAmount(transection.getAmount());
        history.setPaymentType("deposit");
        history.setDate(LocalDateTime.now());
        history.setBalanceAmount(account.getBalance());

        if (account.getHistory()==null){
            account.setHistory(new ArrayList<>());
        }
        account.getHistory().add(history);
        return "Deposit successfully";
    }
////------------------------------withdraw------------------------------
    @Override
    public String withdraw(int accountId, Transection transection) {
        Account account=bankRepository.findById(accountId);
        if (account==null){
            return "account id not found";
        }

        if(account.getBalance()<transection.getAmount()){
            return "check your balance ";
        }
        account.setBalance(account.getBalance()-transection.getAmount());
        History history=new History();
        history.setAccountID(account.getAccountNumber());
        history.setTransactionId(++transectionCount);
        history.setPaymentAmount(transection.getAmount());
        history.setBalanceAmount(account.getBalance());
        history.setPaymentType("withdraw");
        history.setDate(LocalDateTime.now());

        account.getHistory().add(history);
        return "successfully withdraw";
    }
////---------------------histories---------------------------------------
    public List<History> histories(int accountNumber){
        return  bankRepository.findAllById(accountNumber);
    }

    @Override
    public String transection(int fromAccount, int toAccount,Transection transection) {
        Account fromAccounts=bankRepository.findById(fromAccount);
        Account toAccounts=bankRepository.findById(toAccount);
        if (fromAccounts==null){
            return "please check YOUR account number";
        }
        if (toAccounts==null){
            return "please enter the correct account number";
        }
        if(fromAccounts.getBalance()<transection.getAmount()){
            return "check your balance ";
        }
        fromAccounts.setBalance(fromAccounts.getBalance()-transection.getAmount());
        toAccounts.setBalance(toAccounts.getBalance()+transection.getAmount());
        if (fromAccounts.getHistory()==null){
            fromAccounts.setHistory(new ArrayList<>());
        }
        History history1=new History();
        history1.setAccountID(fromAccounts.getAccountNumber());
        history1.setTransactionId(++transectionCount);
        history1.setPaymentAmount(transection.getAmount());
        history1.setBalanceAmount(fromAccounts.getBalance());
        history1.setPaymentType("Transfer" );
        history1.setDate(LocalDateTime.now());

        fromAccounts.getHistory().add(history1);
        if (toAccounts.getHistory()==null){
            toAccounts.setHistory(new ArrayList<>());
        }
        History history2=new History();
        history2.setAccountID(toAccounts.getAccountNumber());
        history2.setTransactionId(transectionCount);
        history2.setPaymentAmount(transection.getAmount());
        history2.setBalanceAmount(toAccounts.getBalance());
        history2.setPaymentType("Transfer" );
        history2.setDate(LocalDateTime.now());

        toAccounts.getHistory().add(history2);
        return "Transfer successfully";

    }
}
