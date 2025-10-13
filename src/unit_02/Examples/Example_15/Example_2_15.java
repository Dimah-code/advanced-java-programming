package unit_02.Examples.Example_15;

import java.util.Scanner;

public class Example_2_15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Number in \"main method\" before calling \"change method\": " + number);
        change(number);
        System.out.println("Number in main method after calling \"change method\": " + number);
    }
    public static void change(int number){
        System.out.println("Number in \"change method\" before change : " + number);
        number = 20;
        System.out.println("Number in \"change method\" after change : " + number);
    }
}
