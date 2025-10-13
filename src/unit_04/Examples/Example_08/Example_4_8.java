package unit_04.Examples.Example_08;
import unit_04.Examples.Example_08.emloyeePackage.*;
public class Example_4_8 {
    public static void main(String[] args) {
        employee emp1 = new employee(4411, 100000);
        employee emp2 = new employee(4412, 120000);
        emp1.display();
        System.out.println();
        emp2.display();
    }
}
