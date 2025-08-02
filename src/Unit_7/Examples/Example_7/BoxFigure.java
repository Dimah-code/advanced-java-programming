package Unit_7.Examples.Example_7;

import javax.swing.*;

public class BoxFigure extends RectangleFigure {
    private double height;

    public BoxFigure() {
        super();
        height = 0;
    }

    public BoxFigure(double length, double width, double height) {
        super(length, width);
        if (height >= 0) {
            this.height = height;
        } else {
            height = 0;
        }
    }

    public void setDimension(double length, double width, double height) {
        super.setDimension(length, width);
        if (height >= 0) {
            this.height = height;
        } else {
            height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return 2 * (getLength() * getWidth() +
                getLength() * height +
                getWidth() * height);
    }

    public double volume() {
        return (super.area() * height);
    }

    public String toString() {
        return ("Length = " + getLength() +
                " Width = " + getWidth() +
                " Height = " + height +
                " Surface area = " + area() +
                " Volume = " + volume());
    }
}
