package unit_06.Examples.Example_16;

public class PascalTriangle {
    private int[][] triangle;
    private int height;

    public void setHigh(int height) {
        this.height = height;
    }

    public void BuildTriangle() {
        triangle = new int[height][];
        triangle[0] = new int[1];
        triangle[0][0] = 1;
        int row = 1;
        while (row < triangle.length) {
            int lastRow[] = triangle[row - 1];
            int newRow[] = new int[row + 1];
            newRow[0] = 1;
            newRow[newRow.length - 1] = 1;
            for (int i = 1; i < newRow.length - 1; i++) {
                newRow[i] = lastRow[i - 1] + lastRow[i];
            }
            triangle[row] = newRow;
            row++;
        }
    }

    public void display() {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < (triangle.length - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(" " + triangle[i][j]);
            }
            System.out.println();
        }
    }
}
