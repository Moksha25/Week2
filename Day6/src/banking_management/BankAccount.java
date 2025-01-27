package banking_management;

public abstract class BankAccount
{
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber()
    {
        this.accountNumber = accountNumber;
    }

    public String getHolderName()
    {
        return holderName;
    }

    public void setHolderName()
    {
        this.holderName = holderName;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        setBalance(getBalance() + amount);
        System.out.println("Amount Deposit");
    }

    public void withdraw(double amount)
    {
        if(getBalance() >= amount )
        {
            setBalance(getBalance() - amount);
            System.out.println("Amount withdraw");
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public void displayDetails()
    {
        System.out.println("Account number : " + accountNumber);
        System.out.println("Account holder name : " + holderName);
        System.out.println("Initial Balance : " + balance);
    }
}
