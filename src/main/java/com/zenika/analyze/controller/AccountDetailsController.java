package com.zenika.analyze.controller;

import com.zenika.analyze.domain.Account;
import com.zenika.analyze.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountDetailsController {

    @Autowired
    AccountService accountService;

    @GetMapping("/account")
    private List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/account/{id}")
    private Account getAccount(@PathVariable("id") int id) {
        return accountService.getAccountById(id);
    }

    @DeleteMapping("/account/{id}")
    private void deleteAccouont(@PathVariable("id") int id) {
        accountService.delete(id);
    }

    @PostMapping("/account")
    private int saveAccount(@RequestBody Account account) {
        accountService.saveOrUpdate(account);
        return account.getId();
    }
}
