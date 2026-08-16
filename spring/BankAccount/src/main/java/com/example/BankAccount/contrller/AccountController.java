package com.example.BankAccount.contrller;


import com.example.BankAccount.domain.Account;
import com.example.BankAccount.domain.History;
import com.example.BankAccount.domain.Transection;
import com.example.BankAccount.service.ServiceImplementation;
import com.example.BankAccount.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class AccountController {

    @Autowired
    ServiceInterface serviceInterface;

    @GetMapping("/getAccount")
    public Account getAccount(@RequestParam ("accountId") int accountID){
        return serviceInterface.getAccount(accountID);
    }

    @PatchMapping("/deposite/{accountID}")
    public String deposite(@PathVariable ("accountID") int accountId, @RequestBody Transection transection){

        return serviceInterface.deposit(accountId,transection);
    }

    @PatchMapping("/withdraw")
    public String withdraw(@RequestParam ("accountID") int accountID,@RequestBody Transection transection){
        return serviceInterface.withdraw(accountID,transection);
    }

    @GetMapping("/history")
    public List<History> history(@RequestParam("accountId") int accountId){
        return serviceInterface.histories(accountId);
    }

    @PatchMapping("/transfer")
    public String transfer(@RequestParam("fromAccount") int fromAccount,@RequestParam("toAccount") int toAccount,@RequestBody Transection transection){
        return serviceInterface.transection(fromAccount,toAccount,transection);
    }
}
