package Unit_5.Exercises.Exercise_4;

import java.util.Scanner;

public class Exercise_5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String stringInput = scanner.nextLine();

        try {
            int number = Integer.parseInt(stringInput);
            System.out.println("Number(string) converted to integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input!");
        }

        System.out.print("Enter a Integer number: ");
        if (scanner.hasNextInt()) {
            int numberInput = scanner.nextInt();
            String stringNumber = Integer.toString(numberInput);
            System.out.println("Integer number converted to String: " + stringNumber);
        } else {
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
