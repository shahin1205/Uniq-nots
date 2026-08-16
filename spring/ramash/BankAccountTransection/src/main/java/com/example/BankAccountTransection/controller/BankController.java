package com.example.BankAccountTransection.controller;


import com.example.BankAccountTransection.model.Account;
import com.example.BankAccountTransection.model.Transaction;
import com.example.BankAccountTransection.model.TransactionHistory;
import com.example.BankAccountTransection.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class BankController {
    @Autowired
    BankService bankService;

    @PostMapping("/addAccount")
    public String addAccounts(@RequestBody Account account){
        return bankService.addAccount(account);
    }

    @GetMapping("/getAccount")
    public List<Account> getAccounts(){
        return bankService.getAccounts();
    }

    @PatchMapping("/deposit/{accountNumber}")
    public String deposits(@PathVariable("accountNumber") int deposit, @RequestBody Transaction transaction){
        return bankService.deposit(deposit,transaction);
    }

    @PatchMapping("/withdraw/{accountID}")
    public String withdraws(@PathVariable ("accountID") int accountID,@RequestBody Transaction transaction){
        return bankService.withdraw(accountID,transaction);
    }

    @GetMapping("/hitory/{accountID}")
    public List<TransactionHistory> history(@PathVariable("accountID") int accountID){
        return bankService.history(accountID);
    }
}
