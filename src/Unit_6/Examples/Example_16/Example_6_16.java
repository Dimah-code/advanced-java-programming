package Unit_6.Examples.Example_16;
import java.util.*;
public class Example_6_16 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int height;
        PascalTriangle triangle = new PascalTriangle();
        System.out.println("Enter the height of triangle: ");
        height = console.nextInt();
        triangle.setHigh(height);
        triangle.BuildTriangle();
        triangle.display();
    }
}
