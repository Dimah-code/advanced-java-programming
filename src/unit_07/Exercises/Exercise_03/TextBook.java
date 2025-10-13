package unit_07.Exercises.Exercise_03;

public class TextBook extends Book {
    // fields
    protected String author;

    // constructors
    public TextBook() {
        super();
        setInfo("No Author");
    }

    public TextBook(String title, int pages, String author) {
        super.setInfo(title, pages);
        setInfo(author);
    }

    // modifiers
    public void setInfo(String author) {
        this.author = author;
    }

    // accessors
    public String getAuthor() {
        return author;
    }

    // Output
    public String toString() {
        return String.format(super.toString() + "Author: %s", author);
    }
}
