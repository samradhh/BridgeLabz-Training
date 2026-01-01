import java.util.*;
public class DisplayBookDetails {
    String title;
    String author;
    int price;
    public DisplayBookDetails(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void displayBookDetails(DisplayBookDetails book) {
            System.out.println("Book Title: " + book.title);
            System.out.println("Book Author: " + book.author);
            System.out.println("Book Price: " + book.price);
            System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        DisplayBookDetails book1 = new DisplayBookDetails("The Great Gatsby", "F. Scott Fitzgerald", 300);
        DisplayBookDetails book2 = new DisplayBookDetails("1984", "George Orwell", 250);
        DisplayBookDetails book3 = new DisplayBookDetails("To Kill a Mockingbird", "Harper Lee", 350);

        List<DisplayBookDetails> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

       for (DisplayBookDetails book : books) {
            displayBookDetails(book);
        }
    }
}