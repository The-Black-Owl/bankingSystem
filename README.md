# Java SE bankingSystem
This is a Java SE application, for a banking system. This project uses Java core concepts to build a bank.
The features of this application, is a **Bank**, **Transaction**, **Account** and **User**. The Java version that is used to build this application is Java 11.

### Bank Class
> Arraylist called bankAccounts, which is to store the newly created accounts.
>> **private final ArrayList<Account> bankAccounts;**  
>> this is an example of encapsulation. This is accomplished using the **private** keyword. This stores the accounts, into the bank.
>- Method to Withdraw from the account.
>- Method to create an account.
>- Method to Deposit into an account.
>- Method to see account details.
>- Method to get transactions.
>- Method to get check balance.

### Account class

> The account class, uses **Encapsulation** for the parameters. This is used to create the account for the user.
> > Account holder(User), account number, list storing transactions and the amount the account contains.

### Transactions class
> The transactions class, is used to create a transaction object. The transaction class is supported by the **Transaction Type** enum.
>> ***Transaction type***: This **Enum** contains the transactions; **DEPOSITE, WITHDRAW, BALANCE**. 

## Users class
> Will contain the usernanme and class