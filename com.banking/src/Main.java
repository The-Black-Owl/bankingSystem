import Bank.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank();
        boolean exit=true;
        Scanner scanner=new Scanner(System.in);
        while(exit){
            System.out.println("Choose transactions:\n" +
                    "- Create\n" +
                    "- Withdraw\n" +
                    "- Balance\n" +
                    "- Deposit\n" +
                    "- Details\n" +
                    "- Transaction\n" +
                    "- Exit");

            String option= scanner.next();
            switch(option.toUpperCase()){
                case "CREATE":
                    bank.createAccount(scanner);
                    break;
                case "WITHDRAW" :
                    bank.withdrawFunds(scanner);
                    break;
                case "DEPOSIT" :
                    bank.depositFunds(scanner);
                    break;
                case "BALANCE":
                    bank.checkBalance(scanner);
                    break;
                case "DETAILS":
                    bank.accountDetails(scanner);
                    break;
                case "TRANSACTION":
                    bank.getTransactions(scanner);
                    break;
                case "EXIT":
                    System.out.println("Thank you for banking");
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}