package basic;

public class BasicOperations {
    private double operator1;
    private double operator2;
    private double result;

    public BasicOperations(double operator1, double operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public void sum() {
        result = operator1 + operator2;
    }
    public void subtraction() {
        result = operator1 - operator2;
    }
    public void multiplication() {
        result = operator1 * operator2;
    }
    public void division() {
        result = operator1 / operator2;
    }

    public double getResult() {
        return result;
    }
}
