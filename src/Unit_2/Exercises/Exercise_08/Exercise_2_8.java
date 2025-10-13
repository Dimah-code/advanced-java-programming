package Unit_2.Exercises.Exercise_08;

import java.util.Scanner;

public class Exercise_2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length, width;
        int sqMeterPrice;
        System.out.println("Enter land's length: ");
        length = scanner.nextDouble();
        System.out.println("Enter land's width: ");
        width = scanner.nextDouble();
        System.out.println("Enter price of each sqMeter of land: ");
        sqMeterPrice = scanner.nextInt();
        System.out.println("Land price: " + calculatePrice(length, width, sqMeterPrice));
        scanner.close();
    }
    public static double calculatePrice(double length, double width, int sqMeterPrice){
    return ((length * width) * sqMeterPrice);
    }
}
