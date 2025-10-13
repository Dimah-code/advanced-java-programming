package unit_05.Exercises.Exercise_06;

import java.util.Scanner;

public class Exercise_5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        int start, end;

        System.out.println("Enter a text: ");
        text = scanner.nextLine();

        System.out.println("Enter a number to start from: ");
        start = scanner.nextInt();

        System.out.println("Enter a number to end point: ");
        end = scanner.nextInt();

        String cutWord = cutter(text, start , end);
        System.out.println("Full text: " + text);
        System.out.println("start from " + start + " to " + end + ": ");
        System.out.println(cutWord);

        scanner.close();
    }
    public static String cutter(String text, int start, int end){
        if(end > text.length() - 1){
            System.out.println("End is out of bound");
            System.out.println("Alert end = length");
            end = text.length() - 1;
        }
        String sub = text.substring(start, end + 1);
        return sub;
    }
}
