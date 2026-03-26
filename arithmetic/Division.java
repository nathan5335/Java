package arithmetic;

public class Division implements ArithmeticOperation {
    @Override
    public double perform(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return num1 / num2;
    }

    @Override
    public String getOperationName() {
        return "Division";
    }

    @Override
    public String getSymbol() {
        return "/";
    }
}
