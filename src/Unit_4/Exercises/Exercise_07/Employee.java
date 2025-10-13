package Unit_4.Exercises.Exercise_07;
public class Employee {
    private int salary;
    private String name;
    private final double insuranceFee = 30;
    private final double taxFee = 10;
    private double tax;
    private double insurance;
    private double finalSalary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public void display(){
        System.out.printf("%s's salary stats: \n", name);
        System.out.printf("Total salary: %d\n", salary);
        System.out.println("10% tax: " + tax);
        System.out.println("30% insurance: " + insurance);
        System.out.printf("Salary with tax and insurance cost: %.2f\n",finalSalary);
    }
    public void calculate(){
        tax = salary * taxFee / 100;
        insurance = salary * insuranceFee / 100;
        finalSalary = salary - (tax + insurance);
    }
}
