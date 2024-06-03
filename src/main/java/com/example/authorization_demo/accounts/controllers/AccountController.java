package com.example.authorization_demo.accounts.controllers;

import com.example.authorization_demo.accounts.services.AccountService;
import com.example.authorization_demo.accounts.dtos.RegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public boolean create(@RequestBody RegistrationDto registrationDto) {
        return accountService.create(registrationDto);
    }
}
