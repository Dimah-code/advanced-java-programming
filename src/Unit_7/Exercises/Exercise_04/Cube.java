package Unit_7.Exercises.Exercise_04;

public class Cube extends Square {
    private double depth;

    public Cube(double height, double width, double depth) {
        super(height, width);
        this.depth = depth;
        ComputeSurfaceArea();
    }

    // getter
    public double getDepth() {
        return depth;
    }

    @Override
    public void ComputeSurfaceArea() {
        surfaceArea = 2 * (getHeight() * getWidth() + getHeight() * depth + depth * getWidth());
    }


}
