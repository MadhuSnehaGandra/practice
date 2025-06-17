// Functional interface with no parameters and no return value
@FunctionalInterface
interface ZeroPrinter {
    void printZero();
}

public class LambdaZero {
    public static void main(String[] args) {
        // Lambda expression that prints "Zero"
        ZeroPrinter zp = () -> System.out.println("Zero");

        // Call the method
        zp.printZero();
    }
}
