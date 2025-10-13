package Unit_6.Exercises.Exercise_02;

import java.util.Scanner;

public class Exercise_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        double[] grades;

        // Input number of students
        System.out.println("Enter number of students: ");
        number = scanner.nextInt();

        grades = new double[number];

        // Input grades
        System.out.println("Enter student grades: \n");
        for (int i = 0; i < number; i++) {
            System.out.println("Enter student " + (i + 1) + " grade: ");
            grades[i] = scanner.nextDouble();
        }

        // Calculate average
        double sum = 0;
        for (int i = 0; i < number; i++) {
            sum += grades[i];
        }
        double average = sum / number;
        System.out.printf("Average: %6.2f\n", average);

        // Output
        System.out.println("Student\tStatus");
        for (int i = 0; i < number; i++) {
            double diff = grades[i] - average;
            String status;
            if (diff > 10) {
                status = "Excellent";
            } else if (diff < -10) {
                status = "Poor";
            } else if (grades[i] >= average) {
                status = "Satisfactory";
            } else {
                status = "Unsatisfactory";
            }

            System.out.println((i + 1) + "\t" + status);
        }

        scanner.close();
    }
}
