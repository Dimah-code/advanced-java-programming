package unit_06.Examples.Example_11;

import java.util.*;

public class Example_6_11 {
    static Scanner in = new Scanner(System.in);
    static String[] master;

    public static void main(String[] args) {
        askArraySize();
        enterData();
        System.out.println("Enter name to search in Masters list");
        String name = new String(in.next());
        int found = seqSearch(name);
        if (found != -1) {
            System.out.println("Master \"" + master[found] + "\" in array : " + found);
        } else {
            System.out.println("Master not found!");
        }
    }

    public static void askArraySize() {
        int num;
        System.out.println("How many master is in your university: ");
        num = in.nextInt();
        master = new String[num];
    }

    public static void enterData() {
        for (int i = 0; i < master.length; i++) {
            master[i] = new String();
            System.out.println("Enter master " + (i + 1) + " name: ");
            master[i] = in.next();
        }
    }

    public static int seqSearch(String name) {
        for (int i = 0; i < master.length; i++) {
            if (master[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
}
