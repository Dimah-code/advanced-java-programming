package unit_03.Examples.Example_01;

import java.util.Scanner;

public class Example_3_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input, sum = 0, average;
        for(int i = 1; i <= 5 ; i++){
            System.out.printf("Enter number %d: \n", i);
            input = scanner.nextInt();
            sum += input;
        }
        average = sum / 5;
        System.out.printf("average = %d", average);
    }
}
