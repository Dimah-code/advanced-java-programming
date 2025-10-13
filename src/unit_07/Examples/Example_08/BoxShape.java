package unit_07.Examples.Example_08;

public class BoxShape extends RectangleShape {
    protected double height;

    public BoxShape() {
        super();
        height = 0;
    }

    public BoxShape(double length, double width, double height) {
        super(length, width);
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setDimension(double length, double width, double height) {
        super.setDiemnsion(length, width);
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double area() {
        return 2 * (length * width + length * height + width * height);
    }

    public double volume() {
        return (length * width * height);
    }

    public String toString() {
        return ("Length: " + length
                + " Width: " + width
                + " Height: " + height
                + " Surface area: " + area()
                + " Volume: " + volume());
    }
}
