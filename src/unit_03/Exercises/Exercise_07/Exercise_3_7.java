package unit_03.Exercises.Exercise_07;

import java.util.Scanner;

public class Exercise_3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter number of week to print that name(1....7: ");
        number = scanner.nextInt();
        switch (number){
            case 1 -> System.out.println("Saturday");
            case 2 -> System.out.println("Sunday");
            case 3 -> System.out.println("Monday");
            case 4 -> System.out.println("Tuesday");
            case 5 -> System.out.println("Wednesday");
            case 6 -> System.out.println("Thursday");
            case 7 -> System.out.println("Friday");
            default -> System.out.println("Invalid number of week(1...7");
        }


        scanner.close();
    }
}
