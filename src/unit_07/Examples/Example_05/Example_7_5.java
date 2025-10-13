package unit_07.Examples.Example_05;

public class Example_7_5 {
    public static void main(String[] args) {
        EmployeeServ employee = new EmployeeServ();
        employee.setID(228398);
        employee.setSalary(12000000);
        employee.setRegion(2);
        System.out.println("ID: " + employee.getID() + " Salary: " + employee.getSalary() + " Region: " + employee.getRegion());
    }
}
