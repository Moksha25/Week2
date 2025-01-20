import java.util.*;

public class BankAccountManagement 
{
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccountManagement(String accountNumber, String accountHolder, double balance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public void displayAccountDetails() 
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    class SavingsAccount extends BankAccountManagement 
    {
        public SavingsAccount(String accountNumber, String accountHolder, double balance) 
        {
            super(accountNumber, accountHolder, balance);
        }

        public void displaySavingsAccountDetails() 
        {
            System.out.println("Savings Account Details:");
            System.out.println("Account Number: " + accountNumber); 
            System.out.println("Account Holder: " + accountHolder); 
            System.out.println("Balance: " + getBalance()); 
        }
    }
    public static void main(String[] args) 
    {
        BankAccountManagement bankAccount1 = new BankAccountManagement("12345", "Mokshini Baglekar", 20000);
        bankAccount1.displayAccountDetails();

        bankAccount1.setBalance(1200.00);
        
        System.out.println("\nUpdated Bank Account Details:");
        bankAccount1.displayAccountDetails();

        BankAccountManagement.SavingsAccount savingsAccount1 = bankAccount1.new SavingsAccount("56789", "Bhavesh Malviya", 50000);
        savingsAccount1.displaySavingsAccountDetails();
    
    }
}