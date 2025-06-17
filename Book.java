import java.util.*;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author);
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully!");
    }

    void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("\nAll Books in Library:");
        for (Book b : books) {
            b.display();
        }
    }

    void searchBook(String title) {
        boolean found = false;
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                b.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    void removeBook(int id) {
        Iterator<Book> iterator = books.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.id == id) {
                iterator.remove();
                System.out.println("Book removed successfully.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Book with ID " + id + " not found.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library lib = new Library();
        int choice;

        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    lib.addBook(new Book(id, title, author));
                    break;

                case 2:
                    lib.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    lib.searchBook(searchTitle);
                    break;

                case 4:
                    System.out.print("Enter book ID to remove: ");
                    int removeId = scanner.nextInt();
                    lib.removeBook(removeId);
                    break;

                case 5:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
