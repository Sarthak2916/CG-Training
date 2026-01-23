package feature_23_1_26;

import java.util.ArrayList;

class Bank {

    String bankName;
    ArrayList<Customer_> customers;

    Bank(String bankName){
        this.bankName= bankName;
        customers= new ArrayList<>();
    }

    void openAccount(Customer_ customer, Account account){
        if(!customers.contains(customer)) customers.add(customer);
        account.bank=this;
    }


}

class Customer_{

    int customerId;
    String customerName;
    ArrayList<Account> accounts;


    Customer_(int customerId, String customerName){
        this.customerId= customerId;
        this.customerName= customerName;
        accounts= new ArrayList<>();
    }

    void addAccount(Account account){
        if(account!=null) accounts.add(account);
    }
    void viewBalance(){
        System.out.println("Customer Name: "+customerName);
        if(accounts.isEmpty()) System.out.println("No Accounts Available");
        else for (Account a: accounts){
            System.out.println("Acc NO.: "+a.accountNumber+"\nBank Name: "+a.bank.bankName+"\nBank Balance: "+a.balance);
        }
    }

}

class Account{

    long accountNumber;
    double balance;
    Bank bank;

    Account(long accountNumber, double balance){
        this.accountNumber= accountNumber;
        this.balance= balance;
    }
}

public class BankingSystem {

    public static void main(String[] args) {
        Bank bank= new Bank("ICICI");
        Customer_ c1= new Customer_(101,"Sarthak");
        Account a1= new Account(256827389,2300);
        c1.addAccount(a1);
        bank.openAccount(c1,a1);
        c1.viewBalance();
    }
}
