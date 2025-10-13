package unit_07.Exercises.FinalProject;

public class SavingsAccount_MinBalance extends BankAccount {
    private double interestRate;
    private double minBalance;

    public SavingsAccount_MinBalance(String accNum, double initialBalance, double minBalance, double interestRate) {
        super(accNum, initialBalance);
        this.minBalance = minBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void monthlyUpdate() {
        if (balance >= minBalance) {
            double interest = balance * interestRate / 100;
            balance += interest;
            System.out.println("Interest added: $" + interest);
        } else {
            System.out.println("Below minimum balance, no interest added.");
        }
    }
}