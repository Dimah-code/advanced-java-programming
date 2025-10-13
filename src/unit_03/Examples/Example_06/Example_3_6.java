package unit_03.Examples.Example_06;

import java.util.Scanner;

public class Example_3_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0 , sum = 0, input = 1;
        while(input != 0){
            System.out.println("Enter a number(0 = stop)");
            input = scanner.nextInt();
            sum += input * input;
            i++;
        }
        System.out.printf("Counter: %d\n", (i - 1));
        System.out.printf("Sum of Sqrt of numbers : %d" , sum);
    }
}
