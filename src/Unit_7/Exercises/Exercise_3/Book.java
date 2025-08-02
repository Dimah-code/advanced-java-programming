package Unit_7.Exercises.Exercise_3;

public class Book {
    // fields
    private String title;
    private int pages;

    // cunstructors
    public Book() {
        setInfo("No title", 0);
    }

    public Book(String title, int pages) {
        setInfo(title, pages);
    }

    public void setInfo(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // modifiers
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // accessors
    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    // Output
    public String toString() {
        return String.format("Title: %s , %dpages ", title, pages);
    }
}
