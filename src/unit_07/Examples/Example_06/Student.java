package unit_07.Examples.Example_06;

import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    protected String name;
    protected long studentId;
    protected float grade;

    public void getInfo() {
        System.out.println("Enter Student's Name: ");
        name = sc.nextLine();
        System.out.println("Enter Student's ID: ");
        studentId = sc.nextLong();
        System.out.println("Enter Student's Grade: ");
        grade = sc.nextFloat();
        sc.nextLine();
    }

    public void showInfo() {
        System.out.print(studentId + "\t\t");
        System.out.print(name.trim() + "\t\t");
        System.out.print(grade + "\n");
    }

    public void showTitle() {
        System.out.println("\nID\t\tName\t\tGrade");
    }
}
