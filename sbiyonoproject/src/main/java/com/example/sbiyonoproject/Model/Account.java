package com.example.sbiyonoproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
  @Id
  int id;
  String AccountNo;
  String name;
  String password;
  int mobileNumber;
  int balance;

  boolean debitcard=false;
  boolean passbook=false;
  boolean chequebook=false;
  public boolean isDebitcard() {
    return debitcard;
  }
  public void setDebitcard(boolean debitcard) {
    this.debitcard = debitcard;
  }
  public boolean isPassbook() {
    return passbook;
  }
  public void setPassbook(boolean passbook) {
    this.passbook = passbook;
  }
  public boolean isChequebook() {
    return chequebook;
  }
  public void setChequebook(boolean chequebook) {
    this.chequebook = chequebook;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getAccountNo() {
    return AccountNo;
  }
  public void setAccountNo(String accountNo) {
    AccountNo = accountNo;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public int getMobileNumber() {
    return mobileNumber;
  }
  public void setMobileNumber(int mobileNumber) {
    this.mobileNumber = mobileNumber;
  }
  public int getBalance() {
    return balance;
  }
  public void setBalance(int balance) {
    this.balance = balance;
  }
  
}
