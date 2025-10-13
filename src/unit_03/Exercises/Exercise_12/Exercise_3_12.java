package unit_03.Exercises.Exercise_12;

public class Exercise_3_12 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(isPerfect(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPerfect(int number){
        int sum = 0;
        for(int i = 1; i <= number / 2; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return number == sum;
    }
}
