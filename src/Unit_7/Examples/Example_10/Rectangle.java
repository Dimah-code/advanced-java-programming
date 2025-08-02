package Unit_7.Examples.Example_10;

public class Rectangle extends GeometricShape {
    protected double length, width;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void calculate() {
        area = length * width;
        perimeter = 2 * (length + width);
    }

    public String toString() {
        return String.format("Rectangle:\nLength = %6.2f  Width = %6.2f\n", length, width);
    }
}
