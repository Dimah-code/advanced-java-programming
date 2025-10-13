package unit_02.Exercises.Exercise_02;

public class Exercise_2_2 {
    public static void main(String[] args) {
        int salary = 80000;
        int netSalary, tax;
        tax = salary * 10 / 100;
        netSalary = salary - tax;
        System.out.println("Your salary: " + salary + "$");
        System.out.println("10% tax: " + tax + "$");
        System.out.println("Your net salary: " + netSalary + "$");
    }
}
