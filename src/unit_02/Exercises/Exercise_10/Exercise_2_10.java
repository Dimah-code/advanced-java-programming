package unit_02.Exercises.Exercise_10;

import java.util.Scanner;

public class Exercise_2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance, benefitPercent, finalBalance, benefit;
        System.out.println("Enter balance account: ");
        balance = scanner.nextInt();
        System.out.println("Enter benefit percent in year: ");
        benefitPercent = scanner.nextInt();
        benefit = balance * benefitPercent / 100;
        finalBalance = balance + benefit;
        System.out.println("Main balance: " + balance);
        System.out.println("Benefit percent: " + benefitPercent + "%");
        System.out.println("Benefit in year: " + benefit);
        System.out.println("Final Balance(year): " + finalBalance);
        scanner.close();
    }
}
