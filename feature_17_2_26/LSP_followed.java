package feature_17_2_26;

import java.util.ArrayList;

public class LSP_followed {

    public static void main(String[] args) {

        Client_ client= new Client_();
        client.addWAccount(new SavingsAccount_());
        client.addWAccount(new CurrAccount_());
        client.addDAccount(new FixedTermAccount_());
        client.depositAndWithdraw();

    }
}

interface DepositOnlyAccount{

    void deposit(int money);
}
interface WithdrawAccount extends DepositOnlyAccount{

    void withdraw(int money);
}

class SavingsAccount_ implements WithdrawAccount{

    public void deposit(int money){
        System.out.println("Rs. "+money+" added to Savings Account");
    }
    public void withdraw(int money){
        System.out.println("Rs. "+money+" debited from Savings Account");
    }
}

class CurrAccount_ implements WithdrawAccount{

    public void deposit(int money){
        System.out.println("Rs. "+money+" added to Current Account");
    }
    public void withdraw(int money){
        System.out.println("Rs. "+money+" debited from Current Account");
    }
}

class FixedTermAccount_ implements DepositOnlyAccount{

    public void deposit(int money){
        System.out.println("Rs. "+money+" added to FixedTerm Account");
    }
    public void withdraw(int money) throws RuntimeException{
        throw new RuntimeException();
    }
}

class Client_{

    ArrayList<DepositOnlyAccount> dAccounts;
    ArrayList<WithdrawAccount> wAccounts;

    Client_(){
        dAccounts= new ArrayList<>();
        wAccounts= new ArrayList<>();
    }

    void addWAccount(WithdrawAccount acc){
        wAccounts.add(acc);
    }
    void addDAccount(DepositOnlyAccount acc){
        dAccounts.add(acc);
    }
    void depositAndWithdraw(){
        for(WithdrawAccount acc: wAccounts){
                acc.deposit(1000);
                acc.withdraw(500);
        }
        for(DepositOnlyAccount acc: dAccounts){
            acc.deposit(1000);
        }
    }



}
