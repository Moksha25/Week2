import java.util.*;

public class BankAccount
{
    private String accountHolder;
    private int accountNumber;
    private int balance;

    //Constructor
    public BankAccount(String accountHolder, int accountNumber, int balance)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    //Method to deposit money
    public void deposit(int amount)
    {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance + " Rs");
    }

    public void withdraw(int amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance + " Rs");
        }
        else
        {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayDetails()
    {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance + " Rs");
    }

    public static void main(String[] args)
    {
        BankAccount account = new BankAccount("Mokshini", 720, 10000);
        account.displayDetails();
        account.deposit(5000);
        account.withdraw(2000);
        account.displayDetails();
    }
}