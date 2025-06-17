import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList of Strings
        ArrayList<String> items = new ArrayList<>();

        // Add elements to the ArrayList
        System.out.print("How many items do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter " + count + " items:");
        for (int i = 0; i < count; i++) {
            String item = scanner.nextLine();
            items.add(item);
        }

        // Display elements
        System.out.println("\nArrayList contents:");
        for (String item : items) {
            System.out.println(item);
        }

        // Search for an element
        System.out.print("\nEnter an item to search: ");
        String searchItem = scanner.nextLine();
        if (items.contains(searchItem)) {
            System.out.println("Item found at index: " + items.indexOf(searchItem));
        } else {
            System.out.println("Item not found.");
        }

        // Remove an element
        System.out.print("\nEnter an item to remove: ");
        String removeItem = scanner.nextLine();
        if (items.remove(removeItem)) {
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found. Nothing removed.");
        }

        // Display updated list
        System.out.println("\nUpdated ArrayList:");
        for (String item : items) {
            System.out.println(item);
        }

        scanner.close();
    }
}
