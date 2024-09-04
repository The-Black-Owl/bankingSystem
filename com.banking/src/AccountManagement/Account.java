package AccountManagement;

import TransactionManagement.Transaction;

import java.util.ArrayList;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double amount;
    private ArrayList<Transaction> transactions;

    public Account(String accountNumber, String accountHolder,
                   double amount) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.amount = amount;
        this.transactions = new ArrayList<>();
        this.transactions.add(new Transaction("Deposite",amount));
    }
}
