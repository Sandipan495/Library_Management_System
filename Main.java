import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Library Management System =====");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show Available Books");
            System.out.println("5. Exit");
            System.out.println("6. Remove Book");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    Book book = new Book(title, author);
                    library.addBook(book);
                    break;

                case 2:
                    // Issue Book
                    System.out.print("Enter user ID: ");
                    int issueUserId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter user name: ");
                    String issueUserName = sc.nextLine();
                    User issueUser = new User(issueUserId, issueUserName);

                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    library.issueBook(issueTitle, issueUser);
                    break;

                case 3:
                    // Return Book
                    System.out.print("Enter user ID: ");
                    int returnUserId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter user name: ");
                    String returnUserName = sc.nextLine();
                    User returnUser = new User(returnUserId, returnUserName);

                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle, returnUser);
                    break;

                case 4:
                    // Show Available Books
                    library.showAvailableBooks();
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting Library Management System. Goodbye!");
                    sc.close();
                    System.exit(0);

                case 6:
                    // Remove Book
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = sc.nextLine();
                    library.removeBook(removeTitle);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
