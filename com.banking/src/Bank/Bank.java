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

    public void createAccount(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter account holder's name:");
        String accountHolder= scanner.nextLine();
        System.out.println("Enter Deposite amount:");
        double initialDeposite= scanner.nextDouble();
        String accountNumber=generateAccountNumber();
        scanner.close();
        Account newAccount= new Account(accountNumber, accountHolder,initialDeposite);
        bankAccounts.add(newAccount);

        System.out.println("Successfully created account! ");
        System.out.println("Account Number: " + accountNumber);
    }

    private String generateAccountNumber(){
        int digits=9;

        // use SecureRandom instead for truly random values
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

    public void withdrawFunds(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter account number");
        String accountNumber= scanner.nextLine();

        //obtain the account object from an Arraylist using account number
        Account account=getAccountByAccountNumber(accountNumber);
        //withdrawal algorithm
        System.out.println("Enter account number");
        double withdrawalAmount= scanner.nextDouble();
        assert account != null;
        double newAmount=account.getAmount()-withdrawalAmount;
        Transaction transaction=new Transaction("Withdrawal",withdrawalAmount);
        ArrayList<Transaction> transactions=account.getTransactions();
        transactions.add(transaction);
        account.setAmount(newAmount);
        account.setTransactions(transactions);

        scanner.close();
        System.out.println("Withdrawal completed!");
    }

    public void checkBalance(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter account number");
        String accountNumber= scanner.nextLine();

        //obtain the account object from an Arraylist using account number
        Account account=getAccountByAccountNumber(accountNumber);
                scanner.close();
        assert account != null;
        System.out.println("Available amount: R "+ account.getAmount());
    }

    public void depositeFunds(){

    }

}

