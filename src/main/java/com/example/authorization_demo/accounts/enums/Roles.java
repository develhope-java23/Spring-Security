package com.example.authorization_demo.accounts.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Roles implements GrantedAuthority {
    ADMIN,
    SALESMAN,
    BUYER
    ;

    @Override
    public String getAuthority() {
        return this.name();
    }
}
