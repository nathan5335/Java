package arithmetic;

public class Addition implements ArithmeticOperation {
    @Override
    public double perform(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public String getOperationName() {
        return "Addition";
    }

    @Override
    public String getSymbol() {
        return "+";
    }
}
