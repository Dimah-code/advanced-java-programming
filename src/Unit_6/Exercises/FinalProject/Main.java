package Unit_6.Exercises.FinalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an odd number (n ≥ 3): ");
        int n = input.nextInt();

        if (n % 2 == 0 || n < 3) {
            System.out.println("Only odd numbers ≥ 3 are allowed.");
            return;
        }

        int[][] magic = new int[n][n];

        int num = 1;
        int i = 0, j = n / 2; // start from middle of top row

        while (num <= n * n) {
            magic[i][j] = num;

            num++;
            int newI = (i - 1 + n) % n;
            int newJ = (j + 1) % n;

            if (magic[newI][newJ] != 0) {
                i = (i + 1) % n;
            } else {
                i = newI;
                j = newJ;
            }
        }

        System.out.println("\nMagic Square of size " + n + ":");
        for (int[] row : magic) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }

        input.close();
    }
}
