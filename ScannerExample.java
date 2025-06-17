import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Read a string (consume the leftover newline first)
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display the inputs
        System.out.println("Hello " + name + "! You entered the number " + number);

        // Close the scanner
        scanner.close();
    }
}
