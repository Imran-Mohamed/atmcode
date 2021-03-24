package com.example.atmservice.dao;

import com.example.atmservice.entity.AccountEntity;
import org.springframework.stereotype.Repository;

public interface AccountDAO {

    Double getBalance(Long accountId);

    Boolean authenticate(AccountEntity accountEntity);

    AccountEntity getAccount(Long accountId);
}
