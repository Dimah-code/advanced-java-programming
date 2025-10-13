package unit_02.Examples.Example_08;

import java.util.Scanner;

public class Example_2_8 {
    static Scanner scanner = new Scanner(System.in);
    static final float P_VALUE = 3.14f;
    public static void main(String[] args){
        float r, p, s;
        System.out.println("Enter circle's radius: ");
        r = scanner.nextFloat();
        p = r * P_VALUE * 2;
        s = r * r * P_VALUE;
        System.out.printf("Perimeter = %.2f \n", p);
        System.out.printf("Area = %.2f ", s);
    }
}
