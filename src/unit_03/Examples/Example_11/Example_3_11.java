package unit_03.Examples.Example_11;

import java.util.Scanner;

public class Example_3_11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double grade;
        System.out.println("Enter student's grade: ");
        grade = scanner.nextDouble();
        System.out.println("Your Order: " + order(grade));
    }
    public static char order(double grade){
        char order = 'F';
        if(grade >= 17 && grade <= 20){
            order = 'A';
        } else if (grade < 17 && grade >= 15) {
            order = 'B';
        }else if (grade < 15 && grade >= 12) {
            order = 'C';
        }else {
            order = 'D';
        }
        return order;
    }
}
