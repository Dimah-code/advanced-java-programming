package Unit_7.Examples.Example_01;

public class Box extends Rectangle {
    private double height;

    public Box() {
        super();
        height = 0;
    }

    public Box(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    public void setDimension(double l, double w, double h) {
        super.setDeimension(l, w);
        if (h >= 0) {
            height = h;
        } else {
            height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return 2 * (getLength() * getHeight() + getLength() * getWidth() + getWidth() * getHeight());
    }

    public double volume() {
        return super.area() * getHeight();
    }

    public String toStr() {
        return (super.toStr() + "; Height = " + height);
    }
}