package TransactionManagement;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionType;
    private double amount;
    private LocalDateTime dateTime;

    public Transaction() {
    }

    public Transaction(String transactionType, double amount, LocalDateTime dateTime) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateTime = dateTime;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    //method to deposite
    //method to withdraw
    //method to view transaction history
}
