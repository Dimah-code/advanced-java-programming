package unit_02.Examples.Example_11;

import java.util.Scanner;

public class Example_2_11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 , num2 , num3;
        System.out.println("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        num3 = scanner.nextInt();
        scanner.close();
        MaxNum(num1, num2, num3);
    }
    public static void MaxNum(int x , int y , int z){
         int max = x;
         if(y > x){
             max = y;
         }
         if (z > max) {
             max = z;
         }
        System.out.println("Max Number: " + max);
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}
