package unit_04.Exercises.FinalProject.FinalProject_2;

public class Book {
    private String title, author, publisher, isbn;

    public Book(){
        setInfo("No Title", "No Author", "No publisher", "No isbn");
    }
    public Book(String title, String author, String publisher, String isbn){
        setInfo(title, author, publisher, isbn);
    }

    public void setInfo(String title, String author, String publisher, String isbn){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }
    public void setTitle(String title){this.title = title;}
    public void setAuthor(String author){this.author = author;}
    public void setPublisher(String publisher){this.publisher = publisher;}
    public void setIsbn(String isbn){this.isbn = isbn;}

    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getPublisher(){return publisher;}
    public String getIsbn(){return isbn;}
    @Override
    public String toString(){
        return "\nTitle: " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nPublisher: " + getPublisher() +
                "\nisbn: " + getIsbn();
    }
}
