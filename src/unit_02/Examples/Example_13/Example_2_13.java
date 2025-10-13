package unit_02.Examples.Example_13;

import java.util.Scanner;

public class Example_2_13 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2, num3, min , max;
        System.out.println("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        num3 = scanner.nextInt();
        scanner.close();
        min = findMin(num1, num2, num3);
        max = findMax(num1, num2, num3);

        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number = " + max);
    }
    public static int findMin(int x , int y, int z){
        int min;
        min = x < y ? x : y;
        min = z < min ? z : min;
        return min;
    }
    public static int findMax(int x ,int y , int z){
        int max;
        max = x > y ? x : y;
        max = z > max ? z : max;
        return max;
    }
}
