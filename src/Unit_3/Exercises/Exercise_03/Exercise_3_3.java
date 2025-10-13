package Unit_3.Exercises.Exercise_03;

import java.util.Scanner;

public class Exercise_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        String next = "y";
        while (next.equalsIgnoreCase("y")){
            System.out.println("Enter a number to check Perfect Number: ");
            input = scanner.nextInt();
            isPerfectNumber(input);
            System.out.println("\nTry again(y/n): ");
            next = scanner.next();
        }

        scanner.close();
    }
    public static void isPerfectNumber(int number){
        int sum = 0;
        for(int i = 1; i < number / 2; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(number == sum){
            System.out.printf("%d is a Perfect Number!\n", number);
        }else{
            System.out.printf("%d is not a Perfect Number!\n", number);
        }
    }
}
