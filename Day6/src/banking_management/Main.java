package banking_management;

public class Main
{
    public static void main (String args [])
    {
        SavingsAccount s_account = new SavingsAccount(123, "Mokshini", 10000);
        s_account.displayDetails();
        s_account.calculateLoanEligibility();

        CurrentAccount c_account = new CurrentAccount(456, "Bhavesh", 50000);
        c_account.displayDetails();
        c_account.calculateLoanEligibility();
    }
}
