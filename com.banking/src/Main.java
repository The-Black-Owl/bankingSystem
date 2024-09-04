import Bank.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank();
        boolean exit=true;
        Scanner scanner=new Scanner(System.in);
        while(exit){
            System.out.println("Choose transactions: Create,Withdraw,Balance,Exit");
            String option= scanner.next();
            switch(option){
                case "Create":
                    bank.createAccount(scanner);
                    break;
                case "Withdraw" :
                    bank.withdrawFunds(scanner);
                    break;
                case "Balance":
                    bank.checkBalance(scanner);
                    break;
                case "Exit":
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