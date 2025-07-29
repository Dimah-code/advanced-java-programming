package Unit_5.Exercises.Exercise_7;

import java.util.Scanner;

public class Exercise_5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;

        System.out.println("Enter a text for str1: ");
        str1 = scanner.nextLine();

        System.out.println("Enter another text for str2: ");
        str2 = scanner.nextLine();

        System.out.println("Before swap str1 & str2: ");
        System.out.printf("str1: %s, str2: %s\n", str1, str2);
        String temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println("After swap str1 & str2: ");
        System.out.printf("str1: %s, str2: %s\n", str1, str2);

        scanner.close();
    }
}
