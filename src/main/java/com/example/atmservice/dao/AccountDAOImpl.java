package com.example.atmservice.dao;

import com.example.atmservice.entity.AccountEntity;
import com.example.atmservice.entity.AccountList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO{

    @Autowired
    private AccountList accountList;
    public Double getBalance(Long accountId){
        Double balance = 0.0;
        for(int i =0;i<accountList.getAccountEntities().size();i++){
            AccountEntity accountEntity = accountList.getAccountEntities().get(i);
            if(accountEntity.getAccountId() == accountId){
                balance = accountEntity.getBalance();
            }
        }
        return balance;
    }

    @Override
    public Boolean authenticate(AccountEntity accountEntity) {
        for(int i =0;i<accountList.getAccountEntities().size();i++){
            AccountEntity accountEntityObj = accountList.getAccountEntities().get(i);
            if(accountEntityObj.getCardNo().equals(accountEntity.getCardNo()) && accountEntityObj.getPinNO().equals(accountEntity.getPinNO())){
                return true;
            }
        }
        throw new RuntimeException("unable to authenticate");
    }

    @Override
    public AccountEntity getAccount(Long accountId) {
        for(int i =0;i<accountList.getAccountEntities().size();i++){
            AccountEntity accountEntity = accountList.getAccountEntities().get(i);
            if(accountEntity.getAccountId() == accountId){
                return accountEntity;
            }
        }
        throw new RuntimeException("AccountNotfound");
    }
}
