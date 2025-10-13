package unit_04.Exercises.FinalProject.FinalProject_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        Book book1 = new Book("Clean Code", "Robert C. Martin", "Prentice Hall", "978-0132350884");
        System.out.println("> Fist status: ");
        System.out.println(book);
        System.out.println(book1);
        System.out.println(">> Enter first book data: ");
        System.out.println(">> Enter Title: ");
        String title = scanner.nextLine();
        book.setTitle(title);
        System.out.println(">> Enter Author: ");
        String author = scanner.nextLine();
        book.setAuthor(author);
        System.out.println(">> Enter Publisher: ");
        String publisher = scanner.nextLine();
        book.setPublisher(publisher);
        System.out.println(">> Enter isbn: ");
        String isbn = scanner.nextLine();
        book.setIsbn(isbn);

        System.out.println(">>> Another Status: ");
        System.out.println(book);
        System.out.println(book1);

    }
}
