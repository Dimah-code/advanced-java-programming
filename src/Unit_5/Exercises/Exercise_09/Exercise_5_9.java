package Unit_5.Exercises.Exercise_09;

import java.util.Scanner;

public class Exercise_5_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0, average, grade;
        int students;

        System.out.println("How many students do you have: ");
        students = scanner.nextInt();

        for(int i = 0; i < students; i++){
            System.out.printf("Enter student[%d] grade:\n", (i + 1));
            grade = scanner.nextDouble();
            sum += grade;
        }

        average = sum / students;

        System.out.printf("Number of students: %d\n", students);
        System.out.printf("Average of student grades: %6.2f\n", average);

        scanner.close();
    }
}
