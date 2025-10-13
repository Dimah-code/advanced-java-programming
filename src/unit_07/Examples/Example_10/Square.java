package unit_07.Examples.Example_10;

public class Square extends Rectangle {
    public Square() {
        this(0);
    }

    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }

    public void setLength(double side) {
        setSide(side);
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public double getSide() {
        return width;
    }

    public String toString() {
        return String.format("Square:\nSide = %6.2f\n", width);
    }
}
