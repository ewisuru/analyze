package com.zenika.analyze.service;

import com.zenika.analyze.domain.Account;
import com.zenika.analyze.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<Account>();
        for(int i = 1; i <= accountRepository.count(); i++){
            Optional<Account> byId = accountRepository.findById(i);
            accounts.add(byId.get());
        }
        return accounts;
    }

    public Account getAccountById(int id) {
        return accountRepository.findById(id).get();
    }

    public void saveOrUpdate(Account account) {
        validate(account.getName());
        accountRepository.save(account);
    }

    public void delete(int id) {
        accountRepository.deleteById(id);
    }

    private void validate(String name) {
        if("crash".equals(name)){
            throw new IllegalArgumentException("Crashing");
        }
    }
}
