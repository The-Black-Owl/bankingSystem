package TransactionManagement;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionType;//change this to enum
    private double amount;
    private LocalDateTime dateTime;

    public Transaction() {
    }

    public Transaction(String transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateTime =  LocalDateTime.now();//time and date which transaction happens
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
}
