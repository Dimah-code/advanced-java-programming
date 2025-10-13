package unit_03.Exercises.Exercise_16;
import java.util.Scanner;

public class Exercise_3_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. n must be greater than 0.");
            return;
        }

        int max, min, sum = 0;

        System.out.print("Enter number 1: ");
        int number = scanner.nextInt();
        max = min = number;
        sum += number;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            number = scanner.nextInt();

            if (number > max) max = number;
            if (number < min) min = number;
            sum += number;
        }

        double average = (double) sum / n;

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
