//Lambda exceptions//
import java.util.InputMismatchException;
import java.util.Scanner;

 class calculator1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean continueCalc = true;
    while (continueCalc) {
      try {
        System.out.println("Choose an operator: +, -, *, or /");
        char operator = input.next().charAt(0);
        System.out.println("Enter first number:");
        double num1 = input.nextDouble();
        System.out.println("Enter second number:");
        double num2 = input.nextDouble();
        double result;
        switch (operator) {
          case '+':
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
            break;
          case '-':
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
            break;
          case '*':
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
            break;
          case '/':
            if (num2 == 0) {
              throw new ArithmeticException("Cannot divide by zero.");
            }
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            break;
          default:
            System.out.println("Invalid operator! Please use +, -, *, or /");
        }

      } catch (InputMismatchException e) {
        System.out.println("Input Error: Please enter valid numeric values.");
        input.nextLine();
      } catch (ArithmeticException e) {
        System.out.println("Arithmetic Error: " + e.getMessage());
      } catch (Exception e) {
        System.out.println("Unexpected Error: " + e.getMessage());
      }
      System.out.print("Do you want to continue? (yes/no): ");
      String choice = input.next();
      if (!choice.equalsIgnoreCase("yes")) {
        continueCalc = false;
        System.out.println("Calculator exited.");
      }
    }

    input.close();
  }
}