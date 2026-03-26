package arithmetic;

public class Subtraction implements ArithmeticOperation {
    @Override
    public double perform(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public String getOperationName() {
        return "Subtraction";
    }

    @Override
    public String getSymbol() {
        return "-";
    }
}
