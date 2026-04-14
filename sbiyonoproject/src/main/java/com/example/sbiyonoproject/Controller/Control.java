package com.example.sbiyonoproject.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.sbiyonoproject.Model.Account;
import com.example.sbiyonoproject.Service.Serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Control {
  @Autowired
  Serv s;
  
  @PostMapping("/signup")
  public String signup(@RequestBody Account acc) {
      return s.openaccount(acc);
      
      
  }

   @PostMapping("/login")
  public String login(@RequestBody Account acc) {
      return s.verify(acc);
      
      
  }

  @GetMapping("/balance")
    public int balance() {
        return s.balance();
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam int amount) {
        return s.deposit(amount);
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam int amount) {
        return s.withdraw(amount);
    }

    @PostMapping("/transfer")
    public String transfer(@RequestParam String toAcc,
                           @RequestParam int amount) {
        return s.transfer(toAcc, amount);
    }


    
  
  
}
