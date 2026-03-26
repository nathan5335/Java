import java.util.Scanner;

// Custom Exception Class
class NegativeNumberException extends Exception {
    private int negativeValue;

    // Constructor with negative value message
    public NegativeNumberException(int value) {
        super("Negative number not allowed: " + value);
        this.negativeValue = value;
    }

    // Constructor with custom message
    public NegativeNumberException(String message) {
        super(message);
        this.negativeValue = 0;
    }

    // Constructor with message and value
    public NegativeNumberException(String message, int value) {
        super(message);
        this.negativeValue = value;
    }

    // Getter for the negative value
    public int getNegativeValue() {
        return negativeValue;
    }

    // Override toString for detailed error reporting
    @Override
    public String toString() {
        return "NegativeNumberException: " + getMessage();
    }
}

public class exp21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int negativeCount = 0;

        System.out.println("");
        System.out.println("   Average of N Positive Integers Calculator");
        System.out.println("");
        System.out.println();

        System.out.print("Enter the number of integers (N): ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " positive integers:");
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();

            try {
                validatePositive(num);
                sum += num;
                count++;
                System.out.println("   ✓ Valid - Added to sum");
            } catch (NegativeNumberException e) {
                System.out.println("   ✗ " + e.toString());
                negativeCount++;
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("   Results Summary");
        System.out.println("");
        System.out.println("Total numbers entered: " + n);
        System.out.println("Valid positive integers: " + count);
        System.out.println("Invalid negative integers: " + negativeCount);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Sum of valid numbers: " + sum);
            System.out.println("Average of valid numbers: " + String.format("%.2f", average));
        } else {
            System.out.println("No valid positive integers were entered!");
        }

        System.out.println("");
        scanner.close();
    }

    public static void validatePositive(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException(number);
        }
    }
}
