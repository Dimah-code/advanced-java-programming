package unit_06.Examples.Example_07;
import java.util.Scanner;

public class Example_6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            list[i] = scanner.nextInt();
        }

        System.out.println("Enter a number to search in array: ");
        number = scanner.nextInt();

        int found = seqSearch(list, number);
        if(found != -1){
            System.out.println("number found in " + found + " position.");
        } else{
            System.out.println("number not found!");
        }
    }
    private static int seqSearch(int[] list , int number){
        boolean found = false;
        int loc = 0;

        while(!found && loc < list.length)
                if(list[loc] == number)
                    found = true;
                else
                    loc++;
        if(found)
            return loc;
        else
            return -1;


    }
}


