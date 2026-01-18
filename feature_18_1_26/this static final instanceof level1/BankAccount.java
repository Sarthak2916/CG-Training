package feature_18_1_26.this_static_final_instanceof_Operator_Level1;

class BankAccount {
    static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final long accountNumber;

    BankAccount(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println();
    }
}
