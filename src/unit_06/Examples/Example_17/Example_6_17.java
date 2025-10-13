package unit_06.Examples.Example_17;

import java.util.Scanner;

public class Example_6_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperature mehr = new Temperature();
        int numDay;
        System.out.println("Enter number of days in Mehr Month: ");
        numDay = scanner.nextInt();

        int[] minTemperature = new int[numDay];
        int[] maxTemperature = new int[numDay];

        System.out.println("Enter daily maximum temperatures for Mehr Month: ");
        for (int i = 0; i < numDay; i++) {
            System.out.println("Enter day " + (i + 1));
            maxTemperature[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Enter daily minimum temperatures for Mehr Month: ");
        for (int i = 0; i < numDay; i++) {
            System.out.println("Enter day " + (i + 1));
            minTemperature[i] = scanner.nextInt();
        }
        System.out.println();

        mehr.setTemp(maxTemperature, minTemperature, numDay);

        System.out.println("Mehr Month:\n" + mehr);
    }
}
