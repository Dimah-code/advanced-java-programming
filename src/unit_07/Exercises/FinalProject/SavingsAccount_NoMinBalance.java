package unit_07.Exercises.FinalProject;

public class SavingsAccount_NoMinBalance extends BankAccount {
    private double interestRate;

    public SavingsAccount_NoMinBalance(String accNum, double initialBalance, double interestRate) {
        super(accNum, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void monthlyUpdate() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}
