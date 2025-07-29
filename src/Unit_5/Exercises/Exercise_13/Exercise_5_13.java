package Unit_5.Exercises.Exercise_13;

import java.util.Scanner;

public class Exercise_5_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word;
        boolean isPalindrome = true;

        System.out.println("Enter a word: ");
        word = scanner.nextLine();

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }

        System.out.println("\nIs " + word + " palindrome? " + isPalindrome);

        scanner.close();
    }
}
