package unit_06.Examples.Example_14;

public class Example_6_14 {
    public static void main(String[] args) {
        int[][] board = {{23, 5, 6, 15, 18},
                {4, 16, 24, 67, 10},
                {12, 54, 23, 76, 11},
                {1, 12, 34, 22, 8},
                {81, 54, 32, 67, 33},
                {12, 34, 76, 78, 91}};
        TwoDimMethods.printMatrix(board);
        System.out.println();
        TwoDimMethods.sumRows(board);
        System.out.println();
        TwoDimMethods.largestInRows(board);
    }
}
