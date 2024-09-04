package Bank;

import AccountManagement.Account;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    private ArrayList<Account> bankAccounts;

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
}
