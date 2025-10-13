package unit_07.Examples.Example_08;

public class RectangleShape {
    protected double length, width;

    public RectangleShape() {
        length = 0;
        width = 0;
    }

    public RectangleShape(double length, double width) {
        setDiemnsion(length, width);
    }

    public void setDiemnsion(double length, double width) {
        if (length >= 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
        if (width >= 0) {
            this.width = width;
        } else {
            width = 0;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return (length * width);
    }

    public double perimeter() {
        return 2 * (length * width);
    }

    public String toString() {
        return ("Length: " + length
                + " Width: " + width
                + " Area: " + area()
                + " Perimeter: " + perimeter());
    }
}
