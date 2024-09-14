package Bank;

import java.util.Random;
import java.util.Scanner;

public interface BankingActions {
    void createAccount(Scanner scanner);
    void withdrawFunds(Scanner scanner);
    void checkBalance(Scanner scanner);
    void depositFunds(Scanner scanner);
    void getTransactions(Scanner scanner);
    void accountDetails(Scanner scanner);

    default String generateAccountNumber(){
        int digits=9;
        final Random r = new Random();
        long randomAccountNumber = r.nextInt(9) + 1;
        for (int i = 1; i < digits; i++) {
            randomAccountNumber = randomAccountNumber * 10L + r.nextInt(10);
        }
        return String.valueOf(randomAccountNumber);
    }
}
