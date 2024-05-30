package com.example.authorization_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public boolean create(RegistrationDto registrationDto) {
        Account account = new Account();
        account.setUsername(registrationDto.getUsername());
        account.setPassword(registrationDto.getPassword());
        accountRepository.save(account);
        return true;
    }
}
