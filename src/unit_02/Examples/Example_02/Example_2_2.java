package unit_02.Examples.Example_02;

public class Example_2_2 {
    public static void main(String[] args) {
        long salary = 120000;
        double tax, netSalary;
        tax = salary * 10 / 100;
        netSalary = salary - tax;

        System.out.print("Your salary is :\t " + salary + "$");
        System.out.println();
        System.out.println("Tax of salary is: \t " + tax + "$" );
        System.out.println("Your net salary is : \t " + netSalary + "$");
    }
}
