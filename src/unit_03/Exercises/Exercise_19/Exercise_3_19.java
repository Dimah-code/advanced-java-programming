package unit_03.Exercises.Exercise_19;

import java.util.Scanner;

public class Exercise_3_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth date:");
        System.out.print("Year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Month (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Day: ");
        int birthDay = scanner.nextInt();

        System.out.println("Enter current date:");
        System.out.print("Year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Month (1-12): ");
        int currentMonth = scanner.nextInt();
        System.out.print("Day: ");
        int currentDay = scanner.nextInt();

        int daysInMonth = 30;
        int monthsInYear = 12;

        int years = currentYear - birthYear;
        int months = currentMonth - birthMonth;
        int days = currentDay - birthDay;

        if (days < 0) {
            days += daysInMonth;
            months--;
        }

        if (months < 0) {
            months += monthsInYear;
            years--;
        }

        int totalDays = years * 365 + months * 30 + days;
        int totalSeconds = totalDays * 24 * 60 * 60;

        System.out.println("You have lived:");
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");
        System.out.println(totalSeconds + " seconds");

        scanner.close();
    }
}

