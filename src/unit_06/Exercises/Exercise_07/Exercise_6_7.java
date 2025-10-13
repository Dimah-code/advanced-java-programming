package unit_06.Exercises.Exercise_07;

import java.util.Scanner;

public class Exercise_6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the degree of the polynomials: ");
        int degree = input.nextInt();

        int[] poly1 = new int[degree + 1];
        int[] poly2 = new int[degree + 1];


        System.out.println("Enter coefficients for the first polynomial (from degree 0 to " + degree + "):");
        for (int i = 0; i <= degree; i++) {
            System.out.print("Coefficient of x^" + i + ": ");
            poly1[i] = input.nextInt();
        }


        System.out.println("Enter coefficients for the second polynomial (from degree 0 to " + degree + "):");
        for (int i = 0; i <= degree; i++) {
            System.out.print("Coefficient of x^" + i + ": ");
            poly2[i] = input.nextInt();
        }


        int[] sum = new int[degree + 1];
        for (int i = 0; i <= degree; i++) {
            sum[i] = poly1[i] + poly2[i];
        }


        int[] product = new int[2 * degree + 1];
        for (int i = 0; i <= degree; i++) {
            for (int j = 0; j <= degree; j++) {
                product[i + j] += poly1[i] * poly2[j];
            }
        }

        System.out.println("\nSum of polynomials:");
        printPolynomial(sum);

        System.out.println("\nProduct of polynomials:");
        printPolynomial(product);


        System.out.print("\nEnter a value for x: ");
        int x = input.nextInt();
        System.out.println("First polynomial evaluated at x = " + x + ": " + evaluate(poly1, x));
        System.out.println("Second polynomial evaluated at x = " + x + ": " + evaluate(poly2, x));

        input.close();
    }


    public static void printPolynomial(int[] poly) {
        boolean isFirst = true;
        for (int i = poly.length - 1; i >= 0; i--) {
            if (poly[i] != 0) {
                if (!isFirst && poly[i] > 0)
                    System.out.print(" + ");
                else if (poly[i] < 0)
                    System.out.print(" - ");
                else if (!isFirst)
                    System.out.print(" ");

                int abs = Math.abs(poly[i]);
                if (i == 0)
                    System.out.print(abs);
                else if (i == 1)
                    System.out.print((abs == 1 ? "" : abs) + "x");
                else
                    System.out.print((abs == 1 ? "" : abs) + "x^" + i);

                isFirst = false;
            }
        }
        if (isFirst) System.out.print("0");
        System.out.println();
    }


    public static int evaluate(int[] poly, int x) {
        int result = 0;
        for (int i = 0; i < poly.length; i++) {
            result += poly[i] * Math.pow(x, i);
        }
        return result;
    }
}
