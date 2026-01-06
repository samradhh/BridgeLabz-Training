public class Library {
    private String title;
    private String author;
    private boolean status;
    public Library(String title,String author,boolean status){
        this.title=title;
        this.author=author;
        this.status=status;
    }
    private static Library[] books = new Library[100];
    private static int bookCount = 0;

    public static void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount] = new Library(title, author, true);
            bookCount++;
        }
    }

    public static Library[] searchByTitle(String partialTitle) {
        Library[] results = new Library[bookCount];
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.toLowerCase().contains(partialTitle.toLowerCase())) {
                results[count++] = books[i];
            }
        }
        return results;
    }

    public static void checkoutBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equalsIgnoreCase(title) && books[i].status) {
                books[i].status = false;
                System.out.println("Book checked out successfully!");
                return;
            }
        }
        System.out.println("Book not available!");
    }

    public static void returnBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equalsIgnoreCase(title) && !books[i].status) {
                books[i].status = true;
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Book not found or already available!");
    }

    public static void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].title + " by " + books[i].author + 
                " - " + (books[i].status ? "Available" : "Checked Out"));
        }
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return status;
    }
    public static void main(String[] args) {
        addBook("The Great Gatsby", "F. Scott Fitzgerald");
        addBook("To Kill a Mockingbird", "Harper Lee");
        addBook("1984", "George Orwell");

        System.out.println("All Books:");
        displayAllBooks();

        System.out.println("\nSearching for '1984':");
        Library[] searchResults = searchByTitle("1984");
        for (Library book : searchResults) {
            if (book != null) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }

        System.out.println("\nChecking out '1984':");
        checkoutBook("1984");
        displayAllBooks();

        System.out.println("\nReturning '1984':");
        returnBook("1984");
        displayAllBooks();
    }
}