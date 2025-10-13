package unit_03.Examples.Example_13;

import java.util.Scanner;

public class Example_3_13 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        boolean done = true;
        while(done){
            System.out.println("Enter lamp's walt to find price(0 = stop): ");
            input = scanner.nextInt();
            switch (input){
                case 0:
                    done = false;
                    break;
                case 40:
                    System.out.println("40 Walt = 1000Rials");
                    break;
                case 60:
                    System.out.println("60 Walt = 1200Rials");
                    break;
                case 75:
                    System.out.println("75 Walt = 1500Rials");
                    break;
                case 100:
                case 150:
                    System.out.println("100 & 150 Walt = 1800Rials");
                    break;
                case 200:
                    System.out.println("200 Walt = 2500Rials");
                    break;
                default:
                    System.out.println("Invalid Input ");
                    continue;
            }
        }
    }
}
