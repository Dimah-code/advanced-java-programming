package unit_03.Exercises.Exercise_14;
import java.util.Scanner;
public class Exercise_3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }

        System.out.printf("Sum of the alternating series up to %d terms is: %.6f%n", n, sum);

        scanner.close();
    }
}
