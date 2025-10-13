package Unit_4.Examples.Example_02;
import java.util.*;
public class rectangle {
    static Scanner in = new Scanner(System.in);
    private double length;
    private double width;
    private double area;
    private double perimeter;
    public void readParameters(){
        System.out.println("Enter length: ");
        length = in.nextDouble();
        System.out.println("Enter width: ");
        width = in.nextDouble();
    }
    public void calculate(){
        perimeter = (length + width) * 2;
        area = length * width;
    }
    public void display(){
        System.out.println("Perimeter :" + perimeter);
        System.out.println("Area: " + area);
    }
}