package unit_03.Examples.Example_12;

import java.util.Scanner;

public class Example_3_12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       int input, oddCounter = 0, evenCounter = 0;
       while(true){
           System.out.println("Enter a numbers to find Odd/Even (0 = stop): ");
           input = scanner.nextInt();
           if(input == 0){
               break;
           }
           if(input % 2 == 0){
                oddCounter++;
           }else{
               evenCounter++;
           }
       }

        System.out.printf("%d odd number you entered\n", oddCounter);
        System.out.printf("%d even number you entered\n", evenCounter);
    }
}
