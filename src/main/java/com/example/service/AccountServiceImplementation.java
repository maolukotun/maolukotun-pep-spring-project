package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Account;
import com.example.repository.AccountRepository;

@Service
public class AccountServiceImplementation implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
    }

    @Override
    public Account getAccountById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
    }

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Integer id, Account account) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }

    @Override
    public void deleteAccount(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public Account getAccountByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    @Override
    public Account authenticate(String username, String password) {
        Account account = getAccountByUsername(username);
        if (account != null && account.getPassword().equals(password)) {
            return account;
        }
        return null;
    }
    

    
}
