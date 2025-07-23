package Unit_5.Exercises.Exercise_8;

import java.util.Scanner;
import static java.lang.Character.*;

public class Exercise_5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text, result;

        System.out.println("Enter a text with some uppercase: ");
        text = scanner.nextLine();

        result = lowerToUpper(text);
        System.out.println(result);
        scanner.close();
    }

    public static String lowerToUpper(String text) {
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(isLetter(arr[i])){
                if(isLowerCase(arr[i])){
                    arr[i] = toUpperCase(arr[i]);
                }
            }
        }
        text = "";
        for (int i = 0; i < arr.length; i++) {
            text += arr[i];
        }
        return text;
    }
}
