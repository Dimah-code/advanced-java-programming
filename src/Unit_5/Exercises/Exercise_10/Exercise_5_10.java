package Unit_5.Exercises.Exercise_10;

import java.util.Scanner;

public class Exercise_5_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed text: " + reversed);

        scanner.close();
    }
}
