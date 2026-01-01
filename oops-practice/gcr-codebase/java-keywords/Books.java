import java.util.*;
public class Books {
    private static String LibrayName;
    private String ISBN;
    private String title;
    private String author;
    private final int isbn;
    
    public Books(){
        this.LibrayName = "City Library";
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = 0;
    }

    public Books(String title, String author, int isbn) {
        this.LibrayName = "City Library";
        this.title = title;
        this.author = author;   
        this.isbn = isbn;
    }
    
    private  void displayLibraryName() {
        if(this instanceof Books) {
            System.out.println("Library Name: " + LibrayName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author); 
            System.out.println("ISBN: " + isbn);
            System.out.println("---------------------------");
        }
        else{
            System.out.println("Not a valid instance");
        }
    }
        public static void main(String[] args) {
            Books book1 = new Books("The Alchemist", "Paulo Coelho", 123456);
            Books book2 = new Books("1984", "George Orwell", 654321);
            Books book3=new Books   ();
            book1.displayLibraryName();
            book2.displayLibraryName();
            book3.displayLibraryName();
        }

}