package unit_06.Exercises.Exercise_01;

import java.util.Scanner;

public class Exercise_6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Enter number of elements: ");
        n = scanner.nextInt();

        int[] x = new int[n], y = new int[n], z = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter x[" + i + "]: ");
            x[i] = scanner.nextInt();

            System.out.println("Enter y[" + i + "]: ");
            y[i] = scanner.nextInt();

            z[i] = x[i] + y[i];
        }

        System.out.println("x\ty\tz");
        for (int i = 0; i < n; i++) {
            System.out.println(x[i] + "\t" + y[i] + "\t" + z[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("z[" + i + "] = " + z[i]);
        }

        scanner.close();
    }
}
