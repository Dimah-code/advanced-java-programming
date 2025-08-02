package Unit_7.Exercises.FinalProject;

public class CurrentAccount_NoMinBalance extends BankAccount {
    private double monthlyCharge;

    public CurrentAccount_NoMinBalance(String accNum, double initialBalance, double monthlyCharge) {
        super(accNum, initialBalance);
        this.monthlyCharge = monthlyCharge;
    }

    @Override
    public void monthlyUpdate() {
        balance -= monthlyCharge;
        System.out.println("Monthly charge applied: $" + monthlyCharge);
    }
}
