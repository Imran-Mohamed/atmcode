package com.example.atmservice.service;

import com.example.atmservice.entity.AccountEntity;
import org.springframework.stereotype.Service;


public interface AccountService {
    Double getBalance(Long accountId);

    AccountEntity getAccount(Long accountId);

    Boolean authenticate(AccountEntity accountEntity);
}
