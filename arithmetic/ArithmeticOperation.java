package arithmetic;

public interface ArithmeticOperation {
    double perform(double num1, double num2);
    String getOperationName();
    String getSymbol();
}
