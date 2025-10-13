package unit_02.Examples.Example_10;

import java.util.Scanner;

public class Example_2_10 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int num1, num2, num3;
        float avg;
        System.out.println("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        num3 = scanner.nextInt();
        avg = (num1 + num2 + num3) / 3;
        System.out.printf("Average without float casting = %d", (int)avg);
        avg = (float)(num1 + num2 + num3 ) / 3;
        System.out.printf("\nAverage with float casting = %5.2f", avg);
    }
}
