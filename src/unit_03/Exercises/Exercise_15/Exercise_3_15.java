package unit_03.Exercises.Exercise_15;

import java.util.Scanner;

public class Exercise_3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;
        System.out.println("Enter C, T ,or S:");
        input = scanner.nextLine().charAt(0);
        switch (input){
            case 'C' -> System.out.println("Circle");
            case 'T' -> System.out.println("Triangle");
            case 'S' -> System.out.println("Square");
            default -> System.out.println("Invalid input, Good bye!");
        }

        scanner.close();
    }
}
