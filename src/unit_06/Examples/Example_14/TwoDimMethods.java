package unit_06.Examples.Example_14;

public class TwoDimMethods {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%7d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void sumRows(int[][] matrix) {
        int sum;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("sum[" + i + "] = " + sum);
        }
    }

    public static void largestInRows(int[][] matrix) {
        int largest;
        for (int i = 0; i < matrix.length; i++) {
            largest = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
            System.out.println("Largest number in row[" + i + "] = " + largest);
        }
    }
}
