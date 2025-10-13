package Unit_4.Examples.Example_03;
import java.util.*;
public class Example_4_3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Temperature temper = new Temperature();
        System.out.println("Enter Tempreture: ");
        double temp = in.nextDouble();
        temper.setTemperature(temp);
        System.out.println(temper.getTemperature());
    }
}