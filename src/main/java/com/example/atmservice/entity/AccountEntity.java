package com.example.atmservice.entity;

import org.springframework.stereotype.Component;

public class AccountEntity {
    private Long cardNo;
    private Long pinNO;
    private Long accountId;
    private String name;
    private Double balance;

    public AccountEntity(Long cardNo, Long pinNO, Long accountId, String name, Double balance) {
        this.cardNo = cardNo;
        this.pinNO = pinNO;
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    public Long getPinNO() {
        return pinNO;
    }

    public void setPinNO(Long pinNO) {
        this.pinNO = pinNO;
    }
}
