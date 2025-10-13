package unit_07.Exercises.FinalProject;

public class CurrentAccount_MinBalance extends BankAccount {
    private double monthlyCharge;
    private double minBalance;

    public CurrentAccount_MinBalance(String accNum, double initialBalance, double monthlyCharge, double minBalance) {
        super(accNum, initialBalance);
        this.monthlyCharge = monthlyCharge;
        this.minBalance = minBalance;
    }

    @Override
    public void monthlyUpdate() {
        if (balance < minBalance) {
            balance -= monthlyCharge;
            System.out.println("Below minimum balance! Charge: $" + monthlyCharge);
        }
    }
}
