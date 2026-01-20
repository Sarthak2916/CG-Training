package feature_19_1_26.inheritance;

public class BankAccount {

    long accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount{

    double interestRate;

    String displayAccountType(){
        return "Savings Account";
    }
}

class CheckingAccount extends BankAccount{

    int withdrawalLimit;

    String displayAccountType(){
        return "Checking Account";
    }
}

class FixedDepositAccount extends BankAccount{

    String displayAccountType(){
        return "Fixed Deposit Account";
    }

}
