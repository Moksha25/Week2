import java.util.*;

class Bank
{
    private ArrayList<Customer> customers;

    public Bank()
    {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) 
    {
        customers.add(customer);
    }

    public void openAccount(Customer customer, int accountNumber, double initialBalance)
    {
        customer.openAccount(accountNumber, initialBalance);
    }
}

class Account 
{
    private int accountNumber;
    private double Balance;

    public Account(int accountNumber, double Balance)
    {
        this.accountNumber = accountNumber;
        this.Balance = Balance;
    }

    public int getaccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return Balance;
    }
}

class Customer
{
    private String accountName;
    private ArrayList<Account> accounts;

    public Customer(String accountName)
    {
        this.accountName = accountName;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(int accountNumber, double initialBalance) 
    {
        Account newAccount = new Account(accountNumber, initialBalance);
        accounts.add(newAccount);
        
        System.out.println("Account " + accountNumber);
        System.out.println("Account Holder Name : " + accountName);
        System.out.println("Initial Balance : " + initialBalance);
    }

    public double viewBalance(int accountNumber) 
    {
        for (Account account : accounts)
        {
            if (account.getaccountNumber() == accountNumber)
            {
                return account.getBalance();
            }
        }
        return 0;
    }

    public ArrayList<Account> getAccounts()
    {
        return accounts;
    }
}

public class BankAccount 
{
    public static void main(String args[])
    {
        Bank bank = new Bank();
        Customer customer = new Customer(null);

        Customer customer1 = new Customer("Mokshini Baglekar");
        Customer customer2 = new Customer("Bhavesh Malviya");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        bank.openAccount(customer1, 123, 10000);
        bank.openAccount(customer2, 456, 50000);

        customer.viewBalance(123);
        customer.viewBalance(456);
    }
}
