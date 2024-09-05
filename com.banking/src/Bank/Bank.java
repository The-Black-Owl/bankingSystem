package Bank;

import AccountManagement.Account;
import TransactionManagement.Transaction;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    private final ArrayList<Account> bankAccounts;

    public Bank() {
        this.bankAccounts = new ArrayList<>();
    }

    public void createAccount(Scanner scanner){
        System.out.println("Enter account holder's name:");
        String accountHolder= scanner.next();
        System.out.println("Enter Deposite amount:");
        double initialDeposite= scanner.nextDouble();
        String accountNumber=generateAccountNumber();
        Account newAccount= new Account(accountNumber, accountHolder,initialDeposite);
        bankAccounts.add(newAccount);
        System.out.println("Successfully created account! ");
        System.out.println("Account Number: " + accountNumber);
    }

    private String generateAccountNumber(){
        int digits=9;
        final Random r = new Random();
        long randomAccountNumber = r.nextInt(9) + 1;
        for (int i = 1; i < digits; i++) {
            randomAccountNumber = randomAccountNumber * 10L + (long) r.nextInt(10);
        }
        return String.valueOf(randomAccountNumber);
    }

    private Account getAccountByAccountNumber(String accountNumber){
        for(Account account:bankAccounts){//loop through arraylist using account
                if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public void withdrawFunds(Scanner scanner){
        System.out.println("Enter account number");
        String accountNumber= scanner.next();
        Account account=getAccountByAccountNumber(accountNumber);
        System.out.println("Enter amount");
        double withdrawalAmount= scanner.nextDouble();
        assert account != null;
        double newAmount=account.getAmount()-withdrawalAmount;
        Transaction transaction=new Transaction("Withdrawal",withdrawalAmount);
        ArrayList<Transaction> transactions=account.getTransactions();
        transactions.add(transaction);
        account.setAmount(newAmount);
        account.setTransactions(transactions);
        System.out.println("Withdrawal completed!");
    }

    public void checkBalance(Scanner scanner){
        System.out.println("Enter account number");
        String accountNumber= scanner.next();
        Account account=getAccountByAccountNumber(accountNumber);
        assert account != null;
        Transaction transaction=new Transaction("Withdrawal",
                account.getAmount());
        ArrayList<Transaction> transactions=account.getTransactions();
        transactions.add(transaction);
        account.setTransactions(transactions);
        System.out.println("Available amount: R "+ account.getAmount());
    }

    public void depositeFunds(Scanner scanner){
        System.out.println("Enter account number");
        String accountNumber= scanner.next();
        Account account=getAccountByAccountNumber(accountNumber);
        System.out.println("Enter amount");
        double withdrawalAmount= scanner.nextDouble();
        assert account != null;
        double newAmount=account.getAmount()+withdrawalAmount;
        Transaction transaction=new Transaction("Deposite",withdrawalAmount);
        ArrayList<Transaction> transactions=account.getTransactions();
        transactions.add(transaction);
        account.setAmount(newAmount);
        account.setTransactions(transactions);
        System.out.println("Deposite completed!");
    }

   public void getTransactions(Scanner scanner){
       System.out.println("Enter account number");
       String accountNumber= scanner.next();
       Account account=getAccountByAccountNumber(accountNumber);
       assert account!=null;
       System.out.println("Transaction: ");
       for(Transaction transaction: account.getTransactions()){
            System.out.println(transaction.toString());
       }
   }
   public void accountDetails(Scanner scanner){
       System.out.println("Enter account number");
       String accountNumber= scanner.next();
       Account account=getAccountByAccountNumber(accountNumber);
       assert account != null;
       String accountDetails="Account Details"+"\nAccount Holder: "+account.getAccountHolder()+
               "\nAccount Number: "+account.getAccountNumber()
               +"\nAvailable Amount: "+account.getAmount();
       System.out.println(accountDetails);
   }
}

