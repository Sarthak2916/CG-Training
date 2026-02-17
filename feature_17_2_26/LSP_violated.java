package feature_17_2_26;

import java.util.ArrayList;

public class LSP_violated {

    public static void main(String[] args) {

        Client client= new Client();
        client.addAccount(new SavingsAccount());
        client.addAccount(new CurrAccount());
        client.addAccount(new FixedTermAccount());
        client.depositAndWithdraw();

    }
}

interface Account{

    void deposit(int money);
    void withdraw(int money);
}

class SavingsAccount implements Account{

    public void deposit(int money){
        System.out.println("Rs. "+money+" added to Savings Account");
    }
    public void withdraw(int money){
        System.out.println("Rs. "+money+" debited from Savings Account");
    }
}

class CurrAccount implements Account{

    public void deposit(int money){
        System.out.println("Rs. "+money+" added to Current Account");
    }
    public void withdraw(int money){
        System.out.println("Rs. "+money+" debited from Current Account");
    }
}

class FixedTermAccount implements Account{

    public void deposit(int money){
        System.out.println("Rs. "+money+" added to FixedTerm Account");
    }
    public void withdraw(int money) throws RuntimeException{
        throw new RuntimeException();
    }
}

class Client{

    ArrayList<Account> accounts;

    Client(){
        accounts= new ArrayList<>();
    }

    void addAccount(Account acc){
        accounts.add(acc);
    }
    void depositAndWithdraw(){
        for(Account acc: accounts){
            try{
                acc.deposit(1000);
                acc.withdraw(500);
            } catch (Exception e){
                System.out.println("Can't withdraw money from FixedTerm Account");
            }
        }
    }



}
