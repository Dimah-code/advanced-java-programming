package unit_03.Exercises.FinalProject;
import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String topName = "", topId = "";
        double topGPA = -1;

        String lowName = "", lowId = "";
        double lowGPA = 21;

        int numberOfStudents;
        System.out.print("Enter number of students: ");
        numberOfStudents = scanner.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Student #" + i);

            System.out.print("Enter name: ");
            String name = scanner.next();

            System.out.print("Enter student ID: ");
            String id = scanner.next();

            System.out.print("Enter number of grades: ");
            int count = scanner.nextInt();

            double sum = 0;
            for (int j = 1; j <= count; j++) {
                System.out.print("Enter grade " + j + ": ");
                double grade = scanner.nextDouble();
                sum += grade;
            }

            double average = sum / count;
            System.out.println("Average: " + average);

            // Update top GPA student
            if (average > topGPA) {
                topGPA = average;
                topName = name;
                topId = id;
            }

            // Update lowest GPA student
            if (average < lowGPA) {
                lowGPA = average;
                lowName = name;
                lowId = id;
            }

            // Check for conditional student
            if (average < 10) {
                System.out.println(">> CONDITIONAL STUDENT");
                System.out.println("Name: " + name);
                System.out.println("ID: " + id);
                System.out.println("GPA: " + average);
            }

            System.out.println("--------------------------");
        }

        // Output results
        System.out.println("\n=== Student with HIGHEST GPA ===");
        System.out.println("Name: " + topName);
        System.out.println("ID: " + topId);
        System.out.println("GPA: " + topGPA);

        System.out.println("\n=== Student with LOWEST GPA ===");
        System.out.println("Name: " + lowName);
        System.out.println("ID: " + lowId);
        System.out.println("GPA: " + lowGPA);

        scanner.close();
    }
}
