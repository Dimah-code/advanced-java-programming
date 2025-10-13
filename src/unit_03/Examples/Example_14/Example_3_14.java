package unit_03.Examples.Example_14;

import java.util.Scanner;

public class Example_3_14 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input , output;
        System.out.println("Enter x value: ");
        input = scanner.nextInt();
        if(input == 0){
            output = 10;
        }
        else{
            output = (5 * input * input) - (3 * input + 6);
        }
        System.out.println("x = " + input + " output = " + output);
    }
}
