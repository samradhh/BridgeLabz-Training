public class Book {
    private String title;
    private String author;
    private double price; 
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;   
        this.price = price;
    }

    public Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public void PrintDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 15.99);
        Book book2 = new Book();

        book1.PrintDetails();
        book2.PrintDetails();
    }
}