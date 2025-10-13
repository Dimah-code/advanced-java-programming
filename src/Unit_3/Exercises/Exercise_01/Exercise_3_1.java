package Unit_3.Exercises.Exercise_01;

public class Exercise_3_1 {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= (row - row + i);j++){
                System.out.print("*\t\t");
            }
            System.out.println();
        }
    }
}
