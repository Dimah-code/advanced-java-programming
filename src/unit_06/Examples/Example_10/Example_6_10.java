package unit_06.Examples.Example_10;

import java.util.Scanner;

public class Example_6_10 {
    static Scanner in = new Scanner(System.in);
    static boolean code = false;
    private static Clerk[] clerkArray;

    public static void main(String[] args) {
        askArraySize();

        while (true) {
            switch (menu()) {
                case 1:
                    enterData();
                    break;
                case 2:
                    if (!code) {
                        System.out.println("You didn't enter any data!");
                        break;
                    } else {
                        showData();
                        break;
                    }
                case 3:
                    System.exit(0);
            }

        }
    }

    public static void askArraySize() {
        System.out.println("How many clerks work in company: ");
        int enter = in.nextInt();
        clerkArray = new Clerk[enter];
    }

    public static void enterData() {
        for (int i = 0; i < clerkArray.length; i++) {
            clerkArray[i] = new Clerk();
            System.out.println("Enter name for clerk " + (i + 1) + ": ");
            clerkArray[i].setName(in.next());
            System.out.println("Enter hours for clerk " + (i + 1) + ": ");
            clerkArray[i].setHours(in.nextFloat());
            System.out.println("Enter rate for clerk " + (i + 1) + ": ");
            clerkArray[i].setRate(in.nextFloat());
        }
        code = true;
    }

    public static int menu() {
        System.out.println("\n1. Enter clerk data.");
        System.out.println("2. Show clerk data");
        System.out.println("3. Exit");
        System.out.println("Enter our select (1,2,3): ");
        int choice = in.nextInt();
        return choice;
    }

    public static void showData() {
        float grossPay, netPay, sumNetSalary = 0;
        System.out.println("Name \t\t Gross pay \t\t Net pay");
        for (int i = 0; i < clerkArray.length; i++) {
            if (clerkArray[i].getHours() <= 40) {
                grossPay = clerkArray[i].getHours() * clerkArray[i].getRate();
            } else {
                grossPay = (40 * clerkArray[i].getRate()) + (clerkArray[i].getHours() - 40) * (float) 1.5 * clerkArray[i].getRate();
            }
            netPay = grossPay - grossPay * 7 / 100;
            sumNetSalary += netPay;
            System.out.print(clerkArray[i].getName().trim() + "\t\t");
            System.out.print(grossPay + "\t\t\t");
            System.out.println(netPay);
        }
        System.out.println("\nThe mean of net pay is: " + sumNetSalary);

    }
}
