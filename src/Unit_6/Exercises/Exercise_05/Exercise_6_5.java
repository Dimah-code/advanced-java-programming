package Unit_6.Exercises.Exercise_05;

import java.util.Scanner;

public class Exercise_6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Morse code map for a-z and space
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",  // a-i
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", // j-r
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."         // s-z
        };

        System.out.println("Enter a sentence ending with a dot (only lowercase letters and spaces):");
        String sentence = scanner.nextLine();

        // Remove the ending dot for processing
        if (sentence.endsWith(".")) {
            sentence = sentence.substring(0, sentence.length() - 1);
        }

        // Convert sentence to morse code
        String[] morseArray = new String[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                morseArray[i] = morse[ch - 'a'];
            } else if (ch == ' ') {
                morseArray[i] = "/"; // Morse code separator for space
            } else {
                morseArray[i] = "?"; // Unknown character
            }
        }

        // Print each Morse code
        System.out.println("Morse Code Output:");
        for (String code : morseArray) {
            System.out.print(code + " ");
        }

        scanner.close();
    }
}
