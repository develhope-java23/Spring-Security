package com.example.authorization_demo.accounts.repositories;

import com.example.authorization_demo.accounts.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account getAccountsByUsername(String username);
}
