package unit_02.Exercises.Exercise_06;

import java.util.Scanner;

public class Exercise_2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, num4, num5, median;
        System.out.println("Enter number 1: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter number 2: ");
        num2 = scanner.nextDouble();
        System.out.println("Enter number 3: ");
        num3 = scanner.nextDouble();
        System.out.println("Enter number 4: ");
        num4 = scanner.nextDouble();
        System.out.println("Enter number 5: ");
        num5 = scanner.nextDouble();

        median = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.printf("Numbers:\n\tnumber 1: %6.2f," +
                " number 2: %6.2f," +
                " number 3: %6.2f ," +
                " number 4: %6.2f" +
                ",number 5: %6.2f", num1 , num2, num3, num4, num5);
        System.out.printf("\nMedian: %6.3f", median);
    }
}
