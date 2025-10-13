package unit_02.Exercises.Exercise_07;

import java.util.Scanner;

public class Exercise_2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Enter a number: ");
        x = scanner.nextInt();
        System.out.println("number after calculation: " + calculation(x));
        scanner.close();
    }
    public static double calculation(int x){
        return ((x * x) + x + 3) / 1;
    }
}
