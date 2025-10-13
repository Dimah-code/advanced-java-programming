package unit_07.Examples.Example_06;

import java.util.Scanner;

public class NightStudent extends Student {
    Scanner sc = new Scanner(System.in);
    private long tuition;

    public void getInfo() {
        System.out.println("Enter Student's Name: ");
        name = sc.nextLine();
        System.out.println("Enter Student's ID: ");
        studentId = sc.nextLong();
        System.out.println("Enter Student's Grade: ");
        grade = sc.nextFloat();
        System.out.println("Enter Student's Tuition: ");
        tuition = sc.nextLong();
        sc.nextLine();
    }

    public void showInfo() {
        System.out.print(studentId + "\t\t");
        System.out.print(name.trim() + "\t\t");
        System.out.print(grade + "\t\t");
        System.out.print(tuition + "\n");
    }

    public void showTitle() {
        System.out.println("\nID\t\tName\t\tGrade\t\tTuition");
    }
}
