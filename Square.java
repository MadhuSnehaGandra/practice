// Functional interface with one parameter
@FunctionalInterface
interface Square {
    void calculate(int x);
}

public class LambdaSingle {
    public static void main(String[] args) {
        // Lambda expression with one parameter
        Square square = (x) -> System.out.println("Square of " + x + " is " + (x * x));

        // Call the method
        square.calculate(5);
    }
}
