package unit_06.Exercises.Exercise_03;

import java.util.Scanner;

public class Exercise_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        double[] grade;
        int[] ID;
        String[] name;

        // Input number of students
        System.out.println("Enter number of students: ");
        number = scanner.nextInt();
        scanner.nextLine();

        grade = new double[number];
        ID = new int[number];
        name = new String[number];

        // Input grades
        System.out.println("Enter student data: \n");
        for (int i = 0; i < number; i++) {
            System.out.println("Enter student " + (i + 1) + " name: ");
            name[i] = scanner.nextLine();

            System.out.println("Enter student " + (i + 1) + " ID: ");
            ID[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter student " + (i + 1) + " grade: ");
            grade[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        // Calculate average
        double sum = 0;
        for (int i = 0; i < number; i++) {
            sum += grade[i];
        }
        double average = sum / number;
        System.out.printf("Average: %6.2f\n", average);

        // Output
        System.out.println("Name\tID\t\tGrade\tStatus");
        for (int i = 0; i < number; i++) {
            double diff = grade[i] - average;
            String status;
            if (diff > 10) {
                status = "Excellent";
            } else if (diff < -10) {
                status = "Poor";
            } else if (grade[i] >= average) {
                status = "Satisfactory";
            } else {
                status = "Unsatisfactory";
            }

            System.out.println(name[i] + "\t" + ID[i] + "\t" + grade[i] + "\t" + status);
        }

        scanner.close();
    }
}
