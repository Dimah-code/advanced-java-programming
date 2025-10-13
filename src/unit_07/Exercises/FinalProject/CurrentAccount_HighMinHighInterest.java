package unit_07.Exercises.FinalProject;

public class CurrentAccount_HighMinHighInterest extends BankAccount {
    private double minBalance;
    private double interestRate;

    public CurrentAccount_HighMinHighInterest(String accNum, double initialBalance, double minBalance, double interestRate) {
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
        }
    }
}

