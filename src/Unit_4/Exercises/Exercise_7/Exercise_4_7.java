package Unit_4.Exercises.Exercise_7;
import java.util.*;
public class Exercise_4_7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        int salary;
        System.out.println("Enter employee name: ");
        name = in.nextLine();
        System.out.println("Enter employee's salary: ");
        salary = in.nextInt();
        Employee employee = new Employee(name, salary);
        employee.calculate();
        employee.display();
    }
}
