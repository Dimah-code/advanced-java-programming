package unit_05.Examples.Example_02;
import java.util.Scanner;

public class Example_5_2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String word, word1;
        System.out.println("Enter first word: ");
        word = in.nextLine();
        System.out.println("Enter second word: ");
        word1 = in.nextLine();
        int compNum = word.compareTo(word1);
        System.out.println(compNum);
        if(word.compareTo(word1) == 0){
            System.out.println("first word == second word");
        }
        if(word.compareTo(word1) < 0){
            System.out.println("first word < second word");
        }
        if(word.compareTo(word1) > 0){
            System.out.println("first word > second word");
        }
    }
}
