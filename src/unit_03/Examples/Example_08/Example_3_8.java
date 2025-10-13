package unit_03.Examples.Example_08;

import java.util.Scanner;

public class Example_3_8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int rate, hoursWorked, salary;
        System.out.println("Enter rate: ");
        rate = scanner.nextInt();
        System.out.println("Enter hours worked: ");
        hoursWorked = scanner.nextInt();
        calculateSalary(rate, hoursWorked);
    }
    public static void calculateSalary(int rate, int hoursWorked){
        int commonWork = 40, overTime = hoursWorked - commonWork;
        double salary = 0, overTimePay = 0;
        if(hoursWorked > commonWork){
            overTimePay = overTime * (rate * 1.5) ;
            salary = overTimePay + (commonWork * rate);
        }
        else{
            salary = hoursWorked * rate;
        }
        System.out.println("Regular pay: " + (commonWork * rate));
        System.out.println("Overtime pay: " + overTimePay);
        System.out.println("Total salary = " + salary);
    }
}
