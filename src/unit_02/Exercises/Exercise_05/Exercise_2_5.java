package unit_02.Exercises.Exercise_05;

import java.util.Scanner;

public class Exercise_2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        int celsius = scanner.nextInt();
        System.out.println("Fahrenheit: " + toFahrenheit(celsius));
        scanner.close();
    }
    public static double toFahrenheit(int celsius){
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
}
