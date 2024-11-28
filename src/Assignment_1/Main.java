package Assignment_1;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount(500.0);

        // Create a deposit transaction
        Calendar date = Calendar.getInstance();
        DepositTransaction deposit = new DepositTransaction(200.0, date);

        // Print transaction details
        deposit.printTransactionDetails();

        // Apply the transaction to the account
        try {
            deposit.apply(account);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Print the updated balance
        System.out.println("Final Account Balance: " + account.getBalance());

        // Attempt to revert the deposit
        try {
            deposit.revert(account);
        } catch (UnsupportedOperationException e) {
            System.out.println("Revert Failed: " + e.getMessage());
        }
    }
}
