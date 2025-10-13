package unit_04.Exercises.Exercise_03;

import java.util.Scanner;

public class Exercise_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter current date:");
        System.out.println("Enter day(1-30): ");
        int currentDay = scanner.nextInt();
        System.out.println("Enter current month(1-12");
        int currentMonth = scanner.nextInt();
        System.out.println("Enter current year:");
        int currentYear = scanner.nextInt();

        int targetDay = 1;
        int targetMonth = 4;
        int targetYear = currentYear + 1;

        int totalDaysNow = (currentYear * 12 * 30) + (currentMonth * 30) + currentDay;
        int totalDaysTarget = (targetYear * 12 * 30) + (targetMonth * 30) + targetDay;

        int daysRemaining = (totalDaysTarget - totalDaysNow);
        System.out.println("Days left until next summer: " + daysRemaining);
        scanner.close();
    }
}
