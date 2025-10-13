package unit_04.Exercises.FinalProject.FinalProject_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator with memory: ");
        while (true) {
            System.out.println("Commands: add | sub | mul | div | last | exit");
            System.out.print("CMD:");
            String command = scanner.next();

            if (command.equals("exit")) {
                System.out.println("Exit!");
                break;
            }

            if (command.equals("last")) {
                System.out.println("Memory: " + calc.getLastOperation());
                continue;
            }

            System.out.print("First number: ");
            double a = scanner.nextDouble();

            System.out.print("Second number: ");
            double b = scanner.nextDouble();

            switch (command) {
                case "add":
                    System.out.println("Result: " + calc.add(a, b));
                    break;
                case "sub":
                    System.out.println("Result: "+ calc.subtract(a, b));
                    break;
                case "mul":
                    System.out.println("Result: " + calc.multiply(a, b));
                    break;
                case "div":
                    System.out.println("Result: " + calc.divide(a, b));
                    break;
                default:
                    System.out.println("Invalid CMD");
            }
        }

        scanner.close();
    }
}
