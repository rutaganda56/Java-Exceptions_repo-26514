import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerator = 0;
        int denominator = 0;
        boolean isValidInput = false;

        System.out.println("=== Division Program with Exception Handling ===");

        // Get numerator with exception handling
        while (!isValidInput) {
            try {
                System.out.print("Enter the numerator (integer): ");
                numerator = scanner.nextInt();
                isValidInput = true; // If input is valid, exit the loop
            } catch (InputMismatchException e) {
                System.err.println("Invalid input! Please enter a valid integer.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        isValidInput = false; // Reset flag for next input

        // Get denominator with exception handling
        while (!isValidInput) {
            try {
                System.out.print("Enter the denominator (integer): ");
                denominator = scanner.nextInt();

                // Check for division by zero
                if (denominator == 0) {
                    throw new ArithmeticException("Division by zero is not allowed!");
                }
                isValidInput = true; // If input is valid, exit the loop

            } catch (InputMismatchException e) {
                System.err.println("Invalid input! Please enter a valid integer.");
                scanner.nextLine(); // Clear the invalid input
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage()); // Custom message for division by zero
                System.out.println("Please enter a non-zero denominator.");
            }
        }

        // Perform division
        try {
            int result = numerator / denominator;
            System.out.println("Result of division: " + numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            System.err.println("An error occurred during division: " + e.getMessage());
        }

        System.out.println("Program completed successfully.");
        scanner.close();
    }
}

