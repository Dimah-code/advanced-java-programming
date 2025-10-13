package unit_03.Examples.Example_15;

import java.util.Scanner;

public class Example_3_15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        System.out.println("Enter a number to find factorial: ");
        input = scanner.nextInt();
        System.out.printf("fact(%d) = %d", input, fact(input));
    }
    public static long fact(int number){
        if(number != 0)
                    return number * fact(number - 1);
             return 1;
    }
}
