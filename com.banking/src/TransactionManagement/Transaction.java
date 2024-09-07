package TransactionManagement;

import java.time.LocalDateTime;

public class Transaction {
    private TransactionType transactionType;//change this to enum
    private double amount;
    private LocalDateTime dateTime;

    public Transaction() {
    }

    public Transaction(TransactionType transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateTime =  LocalDateTime.now();//time and date which transaction happens
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
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

    @Override
    public String toString() {
        return "Transaction:" +
                "transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", dateTime=" + dateTime ;
    }
}
