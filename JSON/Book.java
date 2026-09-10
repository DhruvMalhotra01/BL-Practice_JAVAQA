package JSON;

public class Book {

    private String title;
    private String author;
    private double price;


    public Book() {
        // Required by Jackson for simple deserialization.
    }


    public Book(
            String title,
            String author,
            double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }


    public String getTitle() {

        return title;
    }


    public String getAuthor() {

        return author;
    }


    public double getPrice() {

        return price;
    }
}
