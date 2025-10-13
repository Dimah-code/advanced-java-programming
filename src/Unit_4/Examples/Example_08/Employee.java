package Unit_4.Examples.Example_08;
public class Employee {
    private int salary;
    private String name;
    private final double ins = 0.3;
    private final double tax = 0.1;
    private double withIns;
    private double withTax;
    private double withInsTax;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public void display(){
        System.out.printf("%s's salary stats: \n", name);
        System.out.printf("Total salary: %d\n", salary);
        System.out.printf("Salary with tax: %.2f\n",salary - withTax);
        System.out.printf("Salary with insurance: %.2f\n",salary - withIns);
        System.out.printf("Salary with tax and insurance cost: %.2f\n",salary - withInsTax);
    }
    public void calculate(){
        withTax = salary * tax;
        withIns = salary * ins;
        withInsTax = salary * (ins + tax);
    }
}
