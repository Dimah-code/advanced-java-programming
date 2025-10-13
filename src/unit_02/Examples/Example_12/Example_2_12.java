package unit_02.Examples.Example_12;

import java.util.Scanner;

public class Example_2_12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 , num2;
        System.out.println("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();
        scanner.close();
        System.out.println(sumSqrt(num1, num2));
    }
    public static int sumSqrt(int x , int y){
        int sum;
        sum = x * x + y * y;
        return sum;
    }
}
