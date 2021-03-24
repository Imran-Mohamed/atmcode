package com.example.atmservice;

import com.example.atmservice.entity.AccountEntity;
import com.example.atmservice.entity.AccountList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AtmserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(AtmserviceApplication.class, args);
  }

  @Bean
  public AccountList Users() {
    List<AccountEntity> list = new ArrayList<>();
    list.add(new AccountEntity(12345l, 8888l, 1l, "imran", 3000.0));
    list.add(new AccountEntity(67891l, 9999l, 2l, "ABC", 4000.0));
    list.add(new AccountEntity(15645l, 1111l, 3l, "XYZ", 5000.0));
    list.add(new AccountEntity(67678l, 7777l, 4l, "YYU", 6000.0));
    return new AccountList(list);
  }
}
