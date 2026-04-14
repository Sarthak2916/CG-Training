package com.example.sbiyonoproject.Service;

import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.security.autoconfigure.SecurityProperties.User;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.sbiyonoproject.Model.Account;
import com.example.sbiyonoproject.Model.JWTBuilder;
import com.example.sbiyonoproject.Repository.rep;

@Service
public class Serv{
  @Autowired
  rep r;

  @Autowired
  PasswordEncoder passwordencoder;

  @Autowired
  AuthenticationManager authmanager;

  @Autowired
  JWTBuilder jwtbuilder;

  public String openaccount(Account acc){
    if(acc.getBalance()<1000){
      return "Cannot open 0 Balance Account";
    }
    acc.setAccountNo(UUID.randomUUID().toString());
    acc.setPassword(passwordencoder.encode(acc.getPassword()));
    r.save(acc);
    return "Successfully Created with account number "+acc.getAccountNo();

  }

  public String verify(Account acc) {
      UsernamePasswordAuthenticationToken x=new UsernamePasswordAuthenticationToken(acc.getName(), acc.getPassword());
      Authentication auth;

      try{
        auth=authmanager.authenticate(x);
      }
      catch(Exception e){
        e.getMessage();
      }
      return "Your JWT TOKEN IS "+jwtbuilder.generateToken(acc.getName());

  }


      public int balance() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return r.findByName(username).getBalance();
}

 public String deposit(int amount) {

        String username = SecurityContextHolder.getContext().getAuthentication().getName();

        Account acc = r.findByName(username);
        acc.setBalance(acc.getBalance() +amount);

        r.save(acc);

        return "Deposited";
    }


      public String withdraw(int amount) {

        String username = SecurityContextHolder.getContext().getAuthentication().getName();

        Account acc = r.findByName(username);

        if (acc.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }

        acc.setBalance(acc.getBalance() - amount);
        r.save(acc);

        return "Withdraw successful";
    }


        public String transfer(String toAcc, int amount) {

        String username = SecurityContextHolder.getContext().getAuthentication().getName();

        Account from = r.findByName(username);
        Account to = r.findByAccountNo(toAcc);

        if (from.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }

        from.setBalance(from.getBalance()-amount);
        to.setBalance(to.getBalance() + amount);

        r.save(from);
        r.save(to);

        return "Transfer successful";
    }



    public String requestDebitCard(String accNo) {

    Account a = r.findByAccountNo(accNo);

    if (a.isDebitcard()) {
        throw new RuntimeException("Already have debit card");
    }

    a.setDebitcard(true);
    r.save(a);

    return "Debit card issued";
}


public String requestPassBook(String accNo) {

    Account a = r.findByAccountNo(accNo);

    if (a.isPassbook()) {
        throw new RuntimeException("Already have debit card");
    }

    a.setPassbook(true);
    r.save(a);

    return "Pass Book issued";
}


public String requestChequeBook(String accNo) {

    Account a = r.findByAccountNo(accNo);

    if (a.isChequebook()) {
        throw new RuntimeException("Already have debit card");
    }

    a.setChequebook(true);
    r.save(a);

    return "Cheque Book issued";
}


}
