package com.example.sbiyonoproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbiyonoproject.Model.Account;

public interface rep extends JpaRepository<Account,Integer> {
  Account findByName(String name);
  Account findByAccountNo(String accountno);
}
