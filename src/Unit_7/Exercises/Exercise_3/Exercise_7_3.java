package Unit_7.Exercises.Exercise_3;

import java.util.Scanner;

public class Exercise_7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        Book book1 = new Book("Habits", 160);
        TextBook txtBook = new TextBook();
        TextBook txtBook1 = new TextBook("Murder", 299, "Saeed");

        System.out.println(book);
        System.out.println(book1);
        System.out.println(txtBook);
        System.out.println(txtBook1);

        sc.close();
    }
}
