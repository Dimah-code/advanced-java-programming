package unit_03.Exercises.Exercise_17;

import java.util.Scanner;

public class Exercise_3_17 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0, input, average, A = 0, B = 0, C = 0;
        int validGrades = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter student %d grade: ", (i + 1));
            input = scanner.nextInt();

            if (input >= 90 && input <= 100) {
                A++;
                sum += input;
                validGrades++;
            } else if (input >= 60 && input <= 89) {
                B++;
                sum += input;
                validGrades++;
            } else if (input >= 1 && input <= 59) {
                C++;
                sum += input;
                validGrades++;
            } else {
                System.out.println("Invalid grade! Grade must be between 1 and 100.");
            }
        }

        if (validGrades > 0) {
            average = sum / validGrades;
            System.out.printf("Grades 90 to 100: %d\n", A);
            System.out.printf("Grades 60 to 89: %d\n", B);
            System.out.printf("Grades 1 to 59: %d\n", C);
            System.out.printf("Average of valid grades: %d\n", average);
        } else {
            System.out.println("No valid grades were entered.");
        }
    }
}
