package unit_03.Examples.Example_07;

import java.util.Scanner;

public class Example_3_7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number to make it reverse: ");
        num = scanner.nextInt();
        do{
            System.out.print(num % 10);
            num /= 10;
        }while (num != 0);
    }
}
