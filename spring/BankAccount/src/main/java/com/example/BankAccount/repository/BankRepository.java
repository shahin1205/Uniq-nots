package com.example.BankAccount.repository;

import com.example.BankAccount.domain.Account;
import com.example.BankAccount.domain.History;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BankRepository {
    List<Account> accounts=new ArrayList<>();

    @PostConstruct
    public void loadDefalt(){
        accounts.addAll(Arrays.asList(
                new Account(11,"shahin",0),
                new Account(12,"mahin",0),
                new Account(13,"gokul",0),
                new Account(14,"raja",0)
        ));
    }

    public Account findById(int accountNumber){

        return accounts.stream()
                .filter(acc->acc.getAccountNumber()==accountNumber)
                .findFirst()
                .get();

    }

    public List<History> findAllById(int accountNumber){
        List<History> history= findById(accountNumber).getHistory();
        return history;

//        return findById(accountNumber).getHistory();

    }
}
