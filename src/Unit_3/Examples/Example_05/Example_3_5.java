package Unit_3.Examples.Example_05;

import java.util.Scanner;

public class Example_3_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number to find factorial: ");
        int input = scanner.nextInt();
        System.out.printf("Factorial of number %d = %d\n", input, factorial(input));
    }
    public static long factorial(int number){
        long factorial = 1;
        for(int i = 2; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }
}
