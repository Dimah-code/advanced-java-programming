package Unit_6.Exercises.Exercise_6;

import java.util.Scanner;

public class Exercise_6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first 20-digit number: ");
        String num1 = input.nextLine();

        System.out.print("Enter second 20-digit number: ");
        String num2 = input.nextLine();

        int maxLength = Math.max(num1.length(), num2.length());
        int[] a = new int[maxLength];
        int[] b = new int[maxLength];
        int[] result = new int[maxLength + 1]; // +1 for possible carry

        // Fill arrays from right to left
        for (int i = 0; i < num1.length(); i++)
            a[maxLength - num1.length() + i] = num1.charAt(i) - '0';
        for (int i = 0; i < num2.length(); i++)
            b[maxLength - num2.length() + i] = num2.charAt(i) - '0';

        // Add digit by digit
        int carry = 0;
        for (int i = maxLength - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;

        // Print result
        System.out.print("Sum: ");
        boolean leadingZero = true;
        for (int digit : result) {
            if (digit != 0) leadingZero = false;
            if (!leadingZero) System.out.print(digit);
        }

        if (leadingZero) System.out.println("0"); // in case of 0+0
    }
}
