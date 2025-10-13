package unit_03.Exercises.Exercise_18;

public class Exercise_3_18 {
    public static void main(String[] args) {
        for(int f = 0; f < 3; ++f){
            for(int g = 0; g < 2; ++g){
                System.out.printf("%d %d", f, g);
            }
        }
        // Result: 0 00 11 01 12 02 1
    }
}
