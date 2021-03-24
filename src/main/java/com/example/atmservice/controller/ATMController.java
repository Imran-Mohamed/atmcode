package com.example.atmservice.controller;

import com.example.atmservice.entity.AccountEntity;
import com.example.atmservice.entity.DenominationEntity;
import com.example.atmservice.service.AccountService;
import com.example.atmservice.service.DenominationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ATMController {

  @Autowired private AccountService accountService;

  @Autowired private DenominationService denominationService;
  @GetMapping("/balance/{account_id}")
  public ResponseEntity<Double> getBalance(@PathVariable(name = "account_id") Long accountId) {
    AccountEntity accountEntity = accountService.getAccount(accountId);
    if(accountService.authenticate(accountEntity)){
      return  new ResponseEntity<Double>(accountService.getBalance(accountId), HttpStatus.OK);
    } else {
      throw  new RuntimeException("Account not found");
    }
  }

  @PostMapping("/denomination")
  public ResponseEntity<String> uploadDenominations(@RequestBody DenominationEntity denominationEntity) {
    return new ResponseEntity<String>(denominationService.uploadDenominations(denominationEntity), HttpStatus.OK);
  }


}
