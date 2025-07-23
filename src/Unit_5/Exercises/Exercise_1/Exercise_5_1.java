package Unit_5.Exercises.Exercise_1.StudentClock;
import Unit_5.Exercises.Exercise_1.StudentClock.*;
import java.util.Date;
import java.util.Scanner;

public class Exercise_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock time = new Clock(11, 29,3);

        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter " + name + "'s ID: ");
        int ID = scanner.nextInt();
        Student student = new Student(name, ID, time.toString());
        System.out.println(student);
        scanner.close();
    }
}
