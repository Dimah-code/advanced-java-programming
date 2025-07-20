package Unit_4.Examples.Example_1;
import java.util.*;
public class FabricHelper {
    static Scanner in = new Scanner(System.in);
    private double sqMeters;
    public void readMeters(){
        System.out.println("Enter fabric in meters: ");
        sqMeters = in.nextDouble();
    }
    public double toYards(){
        return sqMeters * 1.96;
    }
    public void display(){
        System.out.println("Fabric in meters " + sqMeters);
        System.out.println("Fabric in yards " + toYards());
    }
}