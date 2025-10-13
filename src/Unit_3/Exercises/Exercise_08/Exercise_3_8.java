package Unit_3.Exercises.Exercise_08;

import java.util.Scanner;

public class Exercise_3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation because a is equal to 0.");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Two distinct real roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("One real root (a repeated root):");
                System.out.println("x = " + x);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imagPart = Math.sqrt(-delta) / (2 * a);
                System.out.println("Two complex roots:");
                System.out.println("x1 = " + realPart + " + " + imagPart + "i");
                System.out.println("x2 = " + realPart + " - " + imagPart + "i");
            }
        }

        scanner.close();
    }
}
