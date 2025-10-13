package Unit_3.Exercises.Exercise_06;

public class Exercise_3_6 {
    public static void main(String[] args) {
        int a = 1, b = 2, number = 89, temp;
        System.out.printf("%d, %d, ", a , b);
        while(b <= number){
            a = a + b;
            System.out.printf("%d, ", b);
            temp = b;
            b = a;
            a = temp;
        }
    }
}
