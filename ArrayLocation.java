import java.util.Scanner;

public class ArrayLocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        System.out.print("Enter number of elements in the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] numbers = new int[size];

        // Read array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read the element to search
        System.out.print("Enter the number to find its location: ");
        int target = scanner.nextInt();

        // Search for the element
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                System.out.println("Number found at index: " + i);
                found = true;
                break; // Remove this break if you want to find all occurrences
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }

        scanner.close();
    }
}
