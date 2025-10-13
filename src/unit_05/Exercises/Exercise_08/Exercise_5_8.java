package unit_05.Exercises.Exercise_08;

import java.util.Scanner;
import static java.lang.Character.*;

public class Exercise_5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString, convertedString;

        System.out.println("Enter a text with some uppercase: ");
        inputString = scanner.nextLine();

        convertedString = lowerToUpper(inputString);
        System.out.printf("Uppercase all lowercase charachters: %s\n", convertedString);

        scanner.close();
    }

    public static String lowerToUpper(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(isLetter(chars[i])){
                if(isLowerCase(chars[i])){
                    chars[i] = toUpperCase(chars[i]);
                }
            }
        }

        return new String(chars);
    }
}
