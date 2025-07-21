package Unit_4.Exercises.FinalProject.FinalProject_1;
public class Calculator {
    private double memory;
    private String lastOperation;

    public Calculator() {
        memory = 0.0;
        lastOperation = "Empty";
    }

    public double add(double a, double b) {
        memory = a + b;
        lastOperation = a + " + " + b + " = " + memory;
        return memory;
    }

    public double subtract(double a, double b) {
        memory = a - b;
        lastOperation = a + " - " + b + " = " + memory;
        return memory;
    }

    public double multiply(double a, double b) {
        memory = a * b;
        lastOperation = a + " * " + b + " = " + memory;
        return memory;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            lastOperation = "Division by zero!";
            System.out.println(lastOperation);
            return Double.NaN;
        }
        memory = a / b;
        lastOperation = a + " / " + b + " = " + memory;
        return memory;
    }

    public String getLastOperation() {
        return lastOperation;
    }

    public double getMemory() {
        return memory;
    }
}
