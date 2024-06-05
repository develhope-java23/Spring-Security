package com.example.authorization_demo.accounts.services;

import com.example.authorization_demo.accounts.entities.Account;
import com.example.authorization_demo.accounts.enums.Roles;
import com.example.authorization_demo.accounts.repositories.AccountRepository;
import com.example.authorization_demo.accounts.dtos.RegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean create(RegistrationDto registrationDto) {
        Account account = new Account();
        account.setUsername(registrationDto.getUsername());
        account.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
        account.setRole(registrationDto.getRole());
        accountRepository.save(account);
        return true;
    }

    public Collection<Account> getAll() {
        return accountRepository.findAll();
    }
}
