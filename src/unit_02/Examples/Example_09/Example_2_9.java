package unit_02.Examples.Example_09;

import java.util.Scanner;
public class Example_2_9 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        String firstName, lastName, line;
        int age;
        double weight;
        System.out.print("Enter first name, last name, " +
                "age, and weight separted by space:\n");
        line = scanner.nextLine();
        System.out.println("Line is " + line);

        System.out.print("Enter first name, last name, " +
                "age, and weight separted by space:\n");
        firstName = scanner.next();
        lastName = scanner.next();
        age = scanner.nextInt();
        weight = scanner.nextDouble();

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);

    }
}
