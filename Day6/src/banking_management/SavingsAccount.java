package banking_management;

public class SavingsAccount extends BankAccount implements Loanable
{
    public boolean appliedForLoan = false;
    public double loanAmount = 0;

    public SavingsAccount(int accountNumber, String holderName, double balance)
    {
        super(accountNumber, holderName, balance);
    }

    public void applyForLoan(double loanAmount)
    {
        if(appliedForLoan)
        {
            System.out.println("Already applied for loan.");
        }
        else
        {
            System.out.println("You can apply for loan.");
        }
    }

    public void calculateLoanEligibility()
    {
        if(appliedForLoan == false)
        {
            System.out.println("You are eligible for applying loan.");
        }
        else
        {
            System.out.println("You already applied for loan.");
        }
    }
}
