import arithmetic.*;

public class exp19 {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 4;

        ArithmeticOperation addition = new Addition();
        ArithmeticOperation subtraction = new Subtraction();
        ArithmeticOperation multiplication = new Multiplication();
        ArithmeticOperation division = new Division();

        System.out.println("Arithmetic Package");
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("");
        System.out.println();

        performOperation(addition, num1, num2);
        performOperation(subtraction, num1, num2);
        performOperation(multiplication, num1, num2);
        performOperation(division, num1, num2);

        System.out.println("");
    }

    public static void performOperation(ArithmeticOperation operation, double num1, double num2) {
        try {
            double result = operation.perform(num1, num2);
            System.out.println(operation.getOperationName() + ": " + num1 + " " + 
                             operation.getSymbol() + " " + num2 + " = " + 
                             String.format("%.2f", result));
        } catch (ArithmeticException e) {
            System.out.println(operation.getOperationName() + ": Error - " + e.getMessage());
        }
    }
}


/*PS C:\Users\MCA\Desktop\gautham> javac exp19.java
PS C:\Users\MCA\Desktop\gautham> java exp19      
Arithmetic Package
Numbers: 20.0 and 4.0


Addition: 20.0 + 4.0 = 24.00
Subtraction: 20.0 - 4.0 = 16.00
Multiplication: 20.0 * 4.0 = 80.00
Division: 20.0 / 4.0 = 5.00 */