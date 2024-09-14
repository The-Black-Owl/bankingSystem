package TransactionManagement;

import java.time.LocalDateTime;

public class Transaction {
    private final TransactionType  transactionType;//change this to enum
    private final double amount;
    private final LocalDateTime  dateTime;

    public Transaction(TransactionType transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateTime =  LocalDateTime.now();//time and date which transaction happens
    }
    @Override
    public String toString() {
        return "Transaction:" +
                "transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", dateTime=" + dateTime ;
    }
}
