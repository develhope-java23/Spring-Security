package com.example.authorization_demo.accounts.controllers;

import com.example.authorization_demo.accounts.entities.Account;
import com.example.authorization_demo.accounts.services.AccountService;
import com.example.authorization_demo.accounts.dtos.RegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public boolean create(@RequestBody RegistrationDto registrationDto) {
        return accountService.create(registrationDto);
    }

    @GetMapping
    public Collection<Account> getAll() {
        return accountService.getAll();
    }
}
