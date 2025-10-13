package unit_03.Exercises.Exercise_11;

public class Exercise_3_11 {
    public static void main(String[] args) {
        int sum = 0;
        for(int n = 1; n <= 50; n++){
            sum += n;
            System.out.printf("Sum from 1 to %d = %d\n", n , sum);
        }
    }
}
