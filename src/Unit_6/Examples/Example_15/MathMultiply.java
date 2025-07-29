package Unit_6.Examples.Example_15;

import java.util.Scanner;

public class MathMultiply {
    static Scanner console = new Scanner(System.in);
    private int[][] x;
    private int[][] y;
    private int[][] z;
    private int row1, col1, col2;

    public void askMatDim() {
        System.out.println("Enter numbers of rows for matrix 1:");
        row1 = console.nextInt();
        System.out.println("Enter numbers of col for matrix 1:");
        col1 = console.nextInt();
        System.out.println("Enter numbers of col for matrix 2:");
        col2 = console.nextInt();
        x = new int[row1][col1];
        y = new int[col1][col2];
        z = new int[x.length][y[0].length];
        System.out.println("****** Reading first array: ");
        readArray(x);
        System.out.println("****** Reading second array: ");
        readArray(y);
    }

    public void readArray(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                mat[i][j] = console.nextInt();
            }
        }
    }

    public void showMultiply() {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                z[i][j] = 0; // Initialize to 0
                for (int k = 0; k < x[i].length; k++) {
                    z[i][j] += x[i][k] * y[k][j]; // Correct matrix multiplication formula
                }
            }
        }
        System.out.println("Print Multiply Matrix: ");
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                System.out.print(z[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
