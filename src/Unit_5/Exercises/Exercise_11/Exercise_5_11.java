package Unit_5.Exercises.Exercise_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mathematical expression(2*5+3-1/2): ");
        String expression = scanner.nextLine();

        String[] parts = splitExpression(expression);

        System.out.println("\nOperands: " + parts[0]);
        System.out.println("Operators: " + parts[1]);

        scanner.close();
    }

    public static String[] splitExpression(String expr) {
        StringBuilder operands = new StringBuilder();
        StringBuilder operators = new StringBuilder();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operators.append(c).append(" ");
            } else if (Character.isDigit(c)) {
                operands.append(c);
            } else if (c != ' ') {
                System.out.println("کاراکتر نادیده گرفته شد: " + c);
            }

            if (i < expr.length() - 1) {
                char next = expr.charAt(i + 1);
                if (isOperator(next) || next == ' ') {
                    operands.append(" ");
                }
            }
        }

        return new String[] {operands.toString().trim(), operators.toString().trim()};
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
