package Unit_6.Exercises.Exercise_08;

import java.util.Scanner;

public class Exercise_6_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] x = new int[3][4];
        int[][] y = new int[3][4];
        int[][] z = new int[3][4];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("Enter x[" + i + "][" + j + "] = ");
                x[i][j] = scanner.nextInt();

                System.out.print("Enter y[" + i + "][" + j + "] = ");
                y[i][j] = scanner.nextInt();

                z[i][j] = x[i][j] + y[i][j];
            }
        }

        // Output
        printMatrix(x, "X");
        printMatrix(y, "Y");
        printMatrix(z, "Z");
    }

    // Helper method for print matrix
    public static void printMatrix(int[][] matrix, String name) {
        System.out.println("\n" + name + " Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(" " + val + " ");
            }
            System.out.println();
        }
    }
}
