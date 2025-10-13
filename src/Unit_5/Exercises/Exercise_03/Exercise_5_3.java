package Unit_5.Exercises.Exercise_03;

import java.util.Scanner;

public class Exercise_5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter a word to search: ");
        String wordToSearch = scanner.nextLine();

        searchWord(text, wordToSearch);

        scanner.close();
    }

    public static void searchWord(String text, String word) {
        int count = 0;
        int index = text.indexOf(word);

        if (index == -1) {
            System.out.println("\"" + word + "\" not found in the text.");
            return;
        }

        while (index != -1) {
            System.out.println("Found \"" + word + "\" at position " + index + ".");
            count++;
            index = text.indexOf(word, index + word.length()); // move forward properly
        }

        System.out.println("The word \"" + word + "\" was found " + count + " time(s).");
    }
}
