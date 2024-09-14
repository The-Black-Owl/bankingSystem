package Bank;

import AccountManagement.Account;
import AccountManagement.AccountStatus;
import TransactionManagement.Transaction;
import TransactionManagement.TransactionType;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements BankingActions {
    private final ArrayList<Account> bankAccounts;
    private static final String PROMPT="Enter account number";
    private static final String AMOUNT_PROMPT="Enter amount";

    public Bank() {
        this.bankAccounts = new ArrayList<>();
    }

    @Override
    public void createAccount(Scanner scanner){
        try{
            System.out.println("Enter account holder's name:");
            String accountHolder= scanner.next();
            System.out.println("Enter deposit amount:");
            double initialDeposit= scanner.nextDouble();
            String accountNumber=generateAccountNumber();
            Account newAccount= new Account(accountNumber, accountHolder,initialDeposit, AccountStatus.ACTIVE);
            bankAccounts.add(newAccount);
            System.out.println("Successfully created account! ");
            System.out.println("Account Number: " + accountNumber);
        }catch(Exception e){
            System.out.println("Account holder,amount cannot be empty...");
        }
    }
    @Override
    public void withdrawFunds(Scanner scanner){
        try{
            TransactionType type= TransactionType.WITHDRAW;
            System.out.println(PROMPT);
            String accountNumber= scanner.next();
            Account account=getAccountByAccountNumber(accountNumber);
            System.out.println(AMOUNT_PROMPT);
            double withdrawalAmount= scanner.nextDouble();
            assert account != null;
            double newAmount=account.getAmount()-withdrawalAmount;
            Transaction transaction=new Transaction(type,withdrawalAmount);
            ArrayList<Transaction> transactions=account.getTransactions();
            transactions.add(transaction);
            account.setAmount(newAmount);
            account.setTransactions(transactions);
            System.out.println("Withdrawal completed!");
        }catch(Exception e){
            System.out.println("Account or amount is invalid");
        }
    }

    @Override
    public void checkBalance(Scanner scanner){
        TransactionType type= TransactionType.BALANCE;
        try {
            System.out.println(PROMPT);
            String accountNumber = scanner.next();
            Account account = getAccountByAccountNumber(accountNumber);
            assert account != null;
            Transaction transaction=new Transaction(type,account.getAmount());
            ArrayList<Transaction> transactions=account.getTransactions();
            transactions.add(transaction);
            account.setTransactions(transactions);
            System.out.println("Available amount: R "+ account.getAmount());
        }catch (NullPointerException e){
            System.out.println("The account number is null");
        }catch(Exception e){
            System.out.println("Account not found...");
        }
    }

   @Override
    public void depositFunds(Scanner scanner){
        try{
            TransactionType type= TransactionType.DEPOSIT;
            System.out.println(PROMPT);
            String accountNumber= scanner.next();
            Account account=getAccountByAccountNumber(accountNumber);
            System.out.println(AMOUNT_PROMPT);
            double withdrawalAmount= scanner.nextDouble();
            assert account != null;
            double newAmount=account.getAmount()+withdrawalAmount;
            Transaction transaction=new Transaction(type,withdrawalAmount);
            ArrayList<Transaction> transactions=account.getTransactions();
            transactions.add(transaction);
            account.setAmount(newAmount);
            account.setTransactions(transactions);
            System.out.println("Deposit completed!");
        }catch(NullPointerException e){
            System.out.println("Account number or amount is not fount");
        }catch(Exception e){
            System.out.println("Amount or Account are invalid");
        }
    }
   @Override
   public void getTransactions(Scanner scanner){
       System.out.println(PROMPT);
       String accountNumber= scanner.next();
       Account account=getAccountByAccountNumber(accountNumber);
       assert account!=null;
       System.out.println("Transaction: ");
       for(Transaction transaction: account.getTransactions()){
            System.out.println(transaction.toString());
       }
   }
   @Override
   public void accountDetails(Scanner scanner){
       System.out.println(PROMPT);
       String accountNumber= scanner.next();
       Account account=getAccountByAccountNumber(accountNumber);
       assert account != null;
       String accountDetails="Account Details"+"\nAccount Holder: "+account.getAccountHolder()+
               "\nAccount Number: "+account.getAccountNumber()
               +"\nAvailable Amount: "+account.getAmount();
       System.out.println(accountDetails);
   }

    private Account getAccountByAccountNumber(String accountNumber){
        for(Account account:bankAccounts){//loop through arraylist using account
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
}

