package Unit_7.Exercises.Exercise_04;

public class Exercise_7_4 {
    public static void main(String[] args) {
        Square sq = new Square(4, 2);
        Cube cube = new Cube(10, 6, 4);
        System.out.printf("Square SurfaceArea: %6.2f\n", sq.getSurfaceArea());
        System.out.printf("Cube SurfaceArea: %6.2f\n", cube.getSurfaceArea());
    }
}
