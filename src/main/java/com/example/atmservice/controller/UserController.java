package com.example.atmservice.controller;

import com.example.atmservice.entity.AccountEntity;
import com.example.atmservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/login")
    public Boolean getBalance(@RequestBody AccountEntity accountEntity) {
        return accountService.authenticate(accountEntity);
    }

}
