package Unit_7.Exercises.FinalProject;

public class Exercise_FinalProject {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new CurrentAccount_NoMinBalance("CA001", 500, 10);
        accounts[1] = new CurrentAccount_MinBalance("CA002", 800, 15, 1000);
        accounts[2] = new CurrentAccount_HighMinHighInterest("CA003", 2000, 1500, 2.0);
        accounts[3] = new SavingsAccount_NoMinBalance("SA001", 1000, 1.5);
        accounts[4] = new SavingsAccount_MinBalance("SA002", 3000, 2000, 2.5);

        // Apply monthly updates
        for (BankAccount acc : accounts) {
            System.out.println("\nBefore update: " + acc);
            acc.monthlyUpdate();
            System.out.println("After update: " + acc);
        }
    }
}
