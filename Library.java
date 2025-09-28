import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Issued to: " + user.getName());
                } else {
                    System.out.println("Sorry, " + title + " is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                System.out.println("Returned by: " + user.getName());
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void removeBook(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            books.remove(book);
            System.out.println(title + " has been removed from the library.");
            return;
        }
    }
    System.out.println("Book not found: " + title);
}

}