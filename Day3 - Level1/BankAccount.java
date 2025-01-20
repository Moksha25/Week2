public class BankAccount
{
    static String bankName = "Bank of India";
    static int bankCount = 0;
    private String accountHolderName;
    final int accountNumber;

    public  BankAccount(String accountHolderName, int accountNumber)
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        bankCount++;
    }

    public static void getTotalAccounts()
    {
        System.out.println("Bank Name : " + bankName);
        System.out.println("Total number of accounts : " + bankCount);
    }

    public static void main (String args[])
    {
        BankAccount account1 = new BankAccount("Mokshini", 1234);
        account1.getTotalAccounts();

        if (account1 instanceof BankAccount)
        {
            System.out.println("bank is an instance of BankAccount");
        }

        BankAccount account2 = new BankAccount("Bhavesh", 5678);
        account2.getTotalAccounts();

        if (account2 instanceof BankAccount)
        {
            System.out.println("bank is an instance of BankAccount");
        }
    }
}