package Unit_5.Exercises.FinalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";

        while (true) {
            System.out.println("\nCurrent text: " + text);
            System.out.println("1. Add text");
            System.out.println("2. Delete last character");
            System.out.println("3. Clear text");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text to add: ");
                    text += scanner.nextLine();
                    break;
                case 2:
                    if (text.length() > 0) {
                        text = text.substring(0, text.length() - 1);
                    }
                    break;
                case 3:
                    text = "";
                    break;
                case 0:
                    System.out.println("Final text: " + text);
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}