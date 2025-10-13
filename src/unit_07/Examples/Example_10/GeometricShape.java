package unit_07.Examples.Example_10;

public abstract class GeometricShape {
    protected double area;
    protected double perimeter;

    public void PrintMe() {
        this.calculate();
        System.out.printf("Area: %6.2f\n", area);
        System.out.printf("Perimeter: %6.2f\n", perimeter);
    }

    abstract protected void calculate();
}
