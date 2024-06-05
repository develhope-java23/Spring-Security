package com.example.authorization_demo.accounts.dtos;

import com.example.authorization_demo.accounts.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDto {

    private String username;
    private String password;
    private Roles role;
}
