package unit_04.Exercises.Exercise_01;
import java.util.*;
public class rectangle {
    static Scanner in = new Scanner(System.in);
    private int length, width , perimeter, area;
    public void readSides(){
        System.out.println("Enter length: ");
        length = in.nextInt();
        System.out.println("Enter width: ");
        width = in.nextInt();
    }
    public void calculate(){
        perimeter = (length + width) * 2;
        area = length * width;
    }
    public void display(){
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
