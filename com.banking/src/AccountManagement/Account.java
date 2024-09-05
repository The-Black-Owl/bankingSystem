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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

}
