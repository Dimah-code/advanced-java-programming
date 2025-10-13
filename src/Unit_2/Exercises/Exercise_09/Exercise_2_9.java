package Unit_2.Exercises.Exercise_09;

import java.util.Scanner;

public class Exercise_2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price, offer, finalPrice;
        System.out.println("Enter book price: ");
        price = scanner.nextInt();
        System.out.println("Enter offer percent: ");
        offer = scanner.nextInt();
        offer = price * offer / 100;
        finalPrice = price - offer;
        System.out.println("Price: " + price);
        System.out.println("Offer cost: " + offer);
        System.out.println("Final price of book: " + finalPrice);
    }
}
