package com.example.atmservice.entity;

import java.util.List;

public class AccountList {
    private List<AccountEntity> accountEntities;

    public AccountList(List<AccountEntity> accountEntities) {
        this.accountEntities = accountEntities;
    }

    public List<AccountEntity> getAccountEntities() {
        return accountEntities;
    }

    public void setAccountEntities(List<AccountEntity> accountEntities) {
        this.accountEntities = accountEntities;
    }
}
