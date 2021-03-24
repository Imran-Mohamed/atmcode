package com.example.atmservice.service;

import com.example.atmservice.dao.AccountDAO;
import com.example.atmservice.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDAO accountDAO;
    @Override
    public Double getBalance(Long accountId){
        return accountDAO.getBalance(accountId);
    }

    @Override
    public AccountEntity getAccount(Long accountId) {
        return accountDAO.getAccount(accountId);
    }

    @Override
    public Boolean authenticate(AccountEntity accountEntity) {
        return accountDAO.authenticate(accountEntity);
    }
}
