package unit_02.Examples.Example_14;

import java.util.Scanner;

public class Example_2_14 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a , b , c, maxInt;
        float x, y, z, maxFloat;
        System.out.println("Enter first integer number: ");
        a = scanner.nextInt();
        System.out.println("Enter second integer number: ");
        b = scanner.nextInt();
        System.out.println("Enter third integer number: ");
        c = scanner.nextInt();

        System.out.println("Enter first float number: ");
        x = scanner.nextFloat();
        System.out.println("Enter second float number: ");
        y = scanner.nextFloat();
        System.out.println("Enter third float number: ");
        z = scanner.nextFloat();
        scanner.close();
        maxFloat = maxFloat(x, y, z);
        maxInt = maxInt(a, b, c);

        System.out.println("Maximum float number = " + maxFloat);
        System.out.println("Maximum int number = " + maxInt);
    }
    public static float maxFloat(float x , float y, float z){
        float max;
        max = x > y ? x : y;
        max = z > max ? z : max;
        return max;
    }
    public static int maxInt(int x ,int y , int z){
        int max;
        max = x > y ? x : y;
        max = z > max ? z : max;
        return max;
    }
}
