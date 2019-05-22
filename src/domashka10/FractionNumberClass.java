package domashka10;

public class FractionNumberClass implements FractionNumber {

    private int dividend;
    private int divisor;

    public FractionNumberClass() {

    }

    public FractionNumberClass(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double value() {
        return (double) dividend / divisor;
    }

    @Override
    public String toString() {
        return dividend + "/" + divisor;
    }
}
