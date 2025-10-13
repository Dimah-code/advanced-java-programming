package Unit_7.Examples.Example_06;

import java.util.Scanner;

public class Example_7_6 {
    private static Student[] dayStudents;
    private static NightStudent[] nightStudents;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        askNumberOfStudents();
        while (true) {
            switch (menu()) {
                case 1 -> enterDataDs();
                case 2 -> showDataDs();
                case 3 -> enterDataNs();
                case 4 -> showDataNs();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid Option! ");
            }
        }
    }

    public static void askNumberOfStudents() {
        System.out.println("How many daily students? ");
        dayStudents = new Student[sc.nextInt()];
        System.out.println("How many night students? ");
        nightStudents = new NightStudent[sc.nextInt()];
    }

    public static void enterDataDs() {
        for (int i = 0; i < dayStudents.length; i++) {
            dayStudents[i] = new Student();
            dayStudents[i].getInfo();
        }
    }

    public static void enterDataNs() {
        for (int i = 0; i < nightStudents.length; i++) {
            nightStudents[i] = new NightStudent();
            nightStudents[i].getInfo();
        }
    }

    public static void showDataDs() {
        dayStudents[0].showTitle();
        for (Student ds : dayStudents) {
            ds.showInfo();
        }
        System.out.println("\n------------------------------------");
    }

    public static void showDataNs() {
        nightStudents[0].showTitle();
        for (NightStudent ns : nightStudents) {
            ns.showInfo();
        }
        System.out.println("\n------------------------------------");
    }

    public static int menu() {
        System.out.println("1. Enter daily students data.");
        System.out.println("2. Report daily students data.");
        System.out.println("3. Enter night students data.");
        System.out.println("4. Report night students data");
        System.out.println("0. Exit");
        System.out.println("Choose: ");
        return sc.nextInt();
    }
}
