package unit_03.Exercises.Exercise_13;
import java.util.Scanner;

public class Exercise_3_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        double sum = 1.0; // starting with 1
        double factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
            sum += 1.0 / factorial;
        }

        System.out.printf("Sum of the series up to %d terms is: %.6f%n", n, sum);

        scanner.close();
    }
}
