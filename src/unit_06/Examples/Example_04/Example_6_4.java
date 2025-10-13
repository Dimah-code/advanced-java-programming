package unit_06.Examples.Example_04;

import java.util.Scanner;

public class Example_6_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to enter: ");
        int[] nums = new int[in.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number " + (i + 1) +": ");
            nums[i] = in.nextInt();
        }

        System.out.println("**************\nBefore calling method");
        Printer(nums);

        toSquare(nums);

        System.out.println("**************\nAfter calling method");
        Printer(nums);

        in.close();
    }
    private static void toSquare(int[] nums){
        System.out.println("************\nMake it to Square...");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.pow(nums[i], 2));
            System.out.println(nums[i]);
        }

        System.out.println("**************\nAfter change in method");
        Printer(nums);
    }
    private static void Printer(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print("numbers[" + i + "]= " + nums[i] + "\n");
        }
    }
}
