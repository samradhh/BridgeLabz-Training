class BookNode {
    int bookId;
    String title;
    String author;
    String genre;
    boolean available;
    BookNode prev;
    BookNode next;

    BookNode(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

public class LibraryManagementSystem {

    private BookNode head;
    private BookNode tail;

    public void addFirst(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);
        if (head == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addLast(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
        if (pos <= 1 || head == null) {
            addFirst(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        int count = 1;

        while (temp.next != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp.next == null) {
            addLast(id, title, author, genre, available);
            return;
        }

        BookNode node = new BookNode(id, title, author, genre, available);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    public void removeByBookId(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head && temp == tail) {
                    head = tail = null;
                } else if (temp == head) {
                    head = head.next;
                    head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    public void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
            }
            temp = temp.next;
        }
    }

    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    private void displayBook(BookNode b) {
        System.out.println(
                b.bookId + " " +
                b.title + " " +
                b.author + " " +
                b.genre + " " +
                (b.available ? "Available" : "Not Available")
        );
    }

    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LibraryManagementSystem lib = new LibraryManagementSystem();

        lib.addFirst(1, "Java", "James Gosling", "Programming", true);
        lib.addLast(2, "Clean Code", "Robert Martin", "Software", true);
        lib.addAtPosition(2, 3, "DSA", "Narasimha", "Education", false);

        lib.displayForward();
        System.out.println("Total Books: " + lib.countBooks());

        lib.updateAvailability(3, true);
        lib.removeByBookId(1);

        System.out.println("Reverse Display:");
        lib.displayReverse();
    }
}