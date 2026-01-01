import java.util.*;
public class LibraryBookSystem {
    private String title;
    private String author;
    private int price;
    private boolean isAvailable;
     static List<LibraryBookSystem> books = new ArrayList<>();
    // Default constructor
    public LibraryBookSystem() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public LibraryBookSystem(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }
    public void borrowBook(String bookTitle) {
        for(LibraryBookSystem b : books) {
            if(b.title.equals(bookTitle)) {
                if(b.isAvailable) {
                    b.isAvailable = false;
                    System.out.println("You have borrowed: " + b.title);
                } else {
                    System.out.println("Sorry, " + b.title + " is currently not available.");
                }
                return;
            }
        }
        System.out.println("Book not found in the library.");
        return;
    }
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Checked Out"));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        LibraryBookSystem defaultBook = new LibraryBookSystem();
        LibraryBookSystem customBook = new LibraryBookSystem("1984", "George Orwell", 123);
        books.add(customBook);
        books.add(defaultBook);
        defaultBook.displayBookInfo();
        customBook.displayBookInfo();
        System.out.println("Pls Note note Down the which book you want to borrow:");
         Scanner r = new Scanner(System.in);
            String bookToBorrow = r.nextLine();
        customBook.borrowBook(bookToBorrow);

    }
}