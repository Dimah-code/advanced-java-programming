package unit_04.Exercises.Exercise_02;
public class CheckingAccount {
    private int NO;
    private int balance;
    private double minBalance = 200.0;
    CheckingAccount(int NO, int balance){
        this.NO = NO;
        this.balance = balance;
    }
    public void display(){
        System.out.println("Account NO: " + NO);
        System.out.println("Account Balance: " + balance);
        System.out.println("Minimum Balance: " + minBalance);
    }
}
