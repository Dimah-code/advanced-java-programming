package unit_02.Exercises.Exercise_03;

import java.util.Scanner;

public class Exercise_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, base, area;
        System.out.println("Enter triangle's height: ");
        height = scanner.nextDouble();
        System.out.println("Enter triangle's base: ");
        base = scanner.nextDouble();
        scanner.close();
        area = (height * base) / 2;
        System.out.println("Height: " + height);
        System.out.println("Base: " + base);
        System.out.println("Area: " + area);
    }
}
