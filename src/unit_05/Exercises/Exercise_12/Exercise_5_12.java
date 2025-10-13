package unit_05.Exercises.Exercise_12;

import java.util.Scanner;
import static java.lang.Character.*;

public class Exercise_5_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        int sum = 0;

        System.out.println("Enter a text with some numbers: ");
        text = scanner.nextLine();

        char[] chars = text.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(isDigit(chars[i])){
                int digit = Integer.parseInt(String.valueOf(chars[i]));
                sum += digit;
            }
        }

        System.out.printf("\nSum of numbers in \"%s\" = %d", text, sum);

        scanner.close();
    }
}
