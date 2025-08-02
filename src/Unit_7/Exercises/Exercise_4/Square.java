package Unit_7.Exercises.Exercise_4;

public class Square {
    private double height, width;
    protected double surfaceArea;

    public Square() {
        setData(0, 0);
    }

    public Square(double height, double width) {
        setData(height, width);
    }

    public void setData(double height, double width) {
        this.height = height;
        this.width = width;
        ComputeSurfaceArea();
    }

    public void ComputeSurfaceArea() {
        surfaceArea = height * width;
    }

    // Getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
}
